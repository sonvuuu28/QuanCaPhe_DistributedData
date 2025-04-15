use QuanCaPhe

------------------- Nguyên Liệu -------------------
go
create procedure spud_listAll_NguyenLieu
	@MaChiNhanh NVARCHAR(50)
as
begin
	set nocount off

	if @MaChiNhanh is null
	begin
		select nl.MaNguyenLieu, nl.TenNguyenLieu, isNull(sum(nlk.KhoiLuong),0) as KhoiLuong, nl.DonVi, nl.TrangThai
		from NguyenLieu as nl 
		left join NguyenLieuKho as nlk on nl.MaNguyenLieu = nlk.MaNguyenLieu
		group by nl.MaNguyenLieu, nl.TenNguyenLieu, nl.DonVi, nl.TrangThai, nlk.MaChiNhanh	
		order by nlk.MaChiNhanh, nl.TrangThai desc, nl.MaNguyenLieu
	end

	else 
	begin
		select nl.MaNguyenLieu, nl.TenNguyenLieu, isNull(nlk.KhoiLuong,0) as KhoiLuong, nl.DonVi, nl.TrangThai
		from NguyenLieu as nl 
		left join NguyenLieuKho as nlk on nl.MaNguyenLieu = nlk.MaNguyenLieu and nlk.MaChiNhanh = @MaChiNhanh
		order by nl.TrangThai desc, nl.MaNguyenLieu
	end
end;

go
create procedure spud_search_NguyenLieu
	@MaChiNhanh NVARCHAR(50),
	@MaNguyenLieu nvarchar(255),
	@TenNguyenLieu nvarchar(255),
	@DonVi nvarchar(255),
	@TrangThai bit
as
begin
	set nocount off

	if @MaChiNhanh is null
	begin
		select nl.MaNguyenLieu, nl.TenNguyenLieu, isNull(sum(nlk.KhoiLuong), 0) as KhoiLuong, nl.DonVi, nl.TrangThai
		from dbo.NguyenLieu as nl 
		left join NguyenLieuKho as nlk on nl.MaNguyenLieu = nlk.MaNguyenLieu
		where nl.MaNguyenLieu like '%'+ @MaNguyenLieu + '%' and nl.TenNguyenLieu like '%'+ @TenNguyenLieu + '%' 
			and nl.DonVi like '%'+ @DonVi + '%' and (nl.TrangThai = @TrangThai or @TrangThai is null)
		group by nl.MaNguyenLieu, nl.TenNguyenLieu, nl.DonVi, nl.TrangThai, nlk.MaChiNhanh		
		order by nlk.MaChiNhanh, nl.TrangThai desc, nl.MaNguyenLieu
	end

	else 
	begin
		select nl.MaNguyenLieu, nl.TenNguyenLieu, isNull(nlk.KhoiLuong, 0) as KhoiLuong, nl.DonVi, nl.TrangThai
		from NguyenLieu as nl 
		left join NguyenLieuKho as nlk on nl.MaNguyenLieu = nlk.MaNguyenLieu and nlk.MaChiNhanh = @MaChiNhanh
		where nl.MaNguyenLieu like '%'+ @MaNguyenLieu + '%' and nl.TenNguyenLieu like '%'+ @TenNguyenLieu + '%' 
			and nl.DonVi like '%'+ @DonVi + '%' and (nl.TrangThai = @TrangThai or @TrangThai is null) 
		order by nl.TrangThai desc, nl.MaNguyenLieu
	end
end;

------------------- LỊCH LÀM -------------------
-------- INSERT
GO
CREATE PROCEDURE insertLichLam
    @MaNhanVien NVARCHAR(50), 
    @MaCaLam NVARCHAR(50), 
    @Ngay DATE,
	@MaChiNhanh nvarchar(10)
AS
BEGIN
    DECLARE @NgayHienTai DATE = GETDATE() 

    IF @Ngay > @NgayHienTai
    BEGIN
        INSERT INTO LINK.QuanCaPhe.dbo.LichLam (MaCaLam, MaNhanVien, NgayLam, MaChiNhanh)
        VALUES (@MaCaLam, @MaNhanVien, @Ngay, @MaChiNhanh)
    END
END
GO
-------- UPDATE
GO
CREATE PROCEDURE updateLichLam
    @MaNhanVien NVARCHAR(50), 
    @MaCaLam NVARCHAR(50), 
    @Ngay DATE
AS
BEGIN
    DECLARE @NgayHienTai DATE = GETDATE() 

    IF @Ngay > @NgayHienTai
    BEGIN
        update LINK.QuanCaPhe.dbo.LichLam 
		set MaCaLam = @MaCaLam
		where MaNhanVien = @MaNhanVien and NgayLam = @Ngay
    END
END
