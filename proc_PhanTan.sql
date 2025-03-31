------------------- LOẠI MÓN -------------------


CREATE PROCEDURE dbo.sp_insertMon
    @MaLoaiMon NVARCHAR(10),
    @TenLoaiMon NVARCHAR(255),
    @TrangThai BIT
AS
BEGIN
    SET NOCOUNT ON;

    INSERT INTO dbo.LoaiMon(MaLoaiMon, TenLoaiMon, TrangThai)
    VALUES (@MaLoaiMon , @TenLoaiMon , @TrangThai );

    BEGIN
        INSERT INTO LINK.QuanCaPhe.dbo.LoaiMon(MaLoaiMon, TenLoaiMon, TrangThai)
    		VALUES (@MaLoaiMon , @TenLoaiMon , @TrangThai );
    END
END
GO

CREATE PROCEDURE dbo.sp_updateLoaiMon
    @MaLoaiMon NVARCHAR(10),
    @TenLoaiMon NVARCHAR(255),
    @TrangThai BIT
AS
BEGIN
    SET NOCOUNT ON;

    UPDATE dbo.LoaiMon
    SET 
        TenLoaiMon = @TenLoaiMon,
        TrangThai = @TrangThai
    WHERE MaLoaiMon = @MaLoaiMon;

    -- Cập nhật bảng NhanVien trên linked server (Test database)
    UPDATE LINK.QuanCaPhe.dbo.LoaiMon
    SET 
        TenLoaiMon = @TenLoaiMon,
        TrangThai = @TrangThai
    WHERE MaLoaiMon = @MaLoaiMon;
END
GO
------------------- LOẠI MÓN -------------------
