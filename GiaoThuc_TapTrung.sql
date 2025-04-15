use QuanCaPhe
--- Trigger: Không thể xóa ca làm
GO
CREATE TRIGGER trg_PreventDeleteCLOFF
ON CaLam
INSTEAD OF DELETE
AS
BEGIN
    IF EXISTS (SELECT 1 FROM deleted WHERE MaCaLam = 'CLOFF')
    BEGIN
        RAISERROR (N'Không thể xóa ca nghỉ CLOFF!', 16, 1);
        RETURN;
    END
    DELETE FROM CaLam WHERE MaCaLam IN (SELECT MaCaLam FROM deleted WHERE MaCaLam != 'CLOFF');
END;

-- Trigger: Auto tạo NguyenLIeuKho sau khi tạo nguyên liệu
GO
CREATE TRIGGER trg_InsertNguyenLieuKho
ON NguyenLieu
AFTER INSERT
AS
BEGIN
    INSERT INTO NguyenLieuKho(MaNguyenLieu, KhoiLuong, MaChiNhanh)
    SELECT i.MaNguyenLieu, 0, cn.MaChiNhanh
    FROM inserted i
    CROSS JOIN ChiNhanh cn;
END;