use QuanCaPhe
--- Trigger: Không thể xóa ca làm
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

-------- INSERT
CREATE PROCEDURE insertLichLam
    @MaNhanVien NVARCHAR(50), 
    @MaCaLam NVARCHAR(50), 
    @Ngay DATE
AS
BEGIN
    DECLARE @NgayHienTai DATE = GETDATE() 

    IF @Ngay > @NgayHienTai
    BEGIN
        INSERT INTO LichLam (MaCaLam, MaNhanVien, NgayLam)
        VALUES (@MaCaLam, @MaNhanVien, @Ngay)
    END
END
GO

-------- UPDATE
CREATE PROCEDURE updateLichLam
    @MaNhanVien NVARCHAR(50), 
    @MaCaLam NVARCHAR(50), 
    @Ngay DATE
AS
BEGIN
    DECLARE @NgayHienTai DATE = GETDATE() 

    IF @Ngay > @NgayHienTai
    BEGIN
        update LichLam 
		set MaCaLam = @MaCaLam
		where MaNhanVien = @MaNhanVien and NgayLam = @Ngay
    END
END
GO

CREATE TRIGGER trg_InsertNguyenLieuKho
ON NguyenLieu
AFTER INSERT
AS
BEGIN
    -- Chèn nguyên liệu mới cho tất cả các chi nhánh
    INSERT INTO NguyenLieuKho (MaNguyenLieu, KhoiLuong, MaChiNhanh)
    SELECT i.MaNguyenLieu, 0, cn.MaChiNhanh
    FROM inserted i
    CROSS JOIN (SELECT DISTINCT MaChiNhanh FROM ChiNhanh) cn;
END;


select * from NguyenLieu

select * from PhieuNhap
select * from ChiTietPhieuNhap

select * from PhieuXuatKho
select * from ChiTietPhieuXuatKho
