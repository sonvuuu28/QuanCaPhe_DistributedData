--create database QuanCaPhe
use QuanCaPhe

/*
DROP TABLE IF EXISTS ChiTietPhieuNhap;
DROP TABLE IF EXISTS ChiTietHoaDon;
DROP TABLE IF EXISTS ChiTietPhieuXuatKho;
DROP TABLE IF EXISTS LichLam;
DROP TABLE IF EXISTS CaLam;
DROP TABLE IF EXISTS TaiKhoan;
DROP TABLE IF EXISTS PhanQuyen;
DROP TABLE IF EXISTS PhieuNhap;
DROP TABLE IF EXISTS HoaDon;
DROP TABLE IF EXISTS PhieuXuatKho;
DROP TABLE IF EXISTS KhachHang;
DROP TABLE IF EXISTS KhuyenMai;
DROP TABLE IF EXISTS UuDaiThanhVien;
DROP TABLE IF EXISTS Mon;
DROP TABLE IF EXISTS LoaiMon;
DROP TABLE IF EXISTS NguyenLieuKho;
DROP TABLE IF EXISTS NguyenLieu;
DROP TABLE IF EXISTS NhaCungCap;
DROP TABLE IF EXISTS NhanVien
DROP TABLE IF EXISTS ChiNhanh;
*/

CREATE TABLE ChiNhanh (
	MaChiNhanh NVARCHAR(10) PRIMARY KEY,
	TenChiNhanh NVARCHAR(255),
	DiaChi NVARCHAR(255),
	TrangThai BIT
);

CREATE TABLE LoaiMon (
	MaLoaiMon NVARCHAR(10) PRIMARY KEY,
	TenLoaiMon NVARCHAR(255),
	TrangThai BIT
);

CREATE TABLE Mon (
	MaMon NVARCHAR(10) PRIMARY KEY,
	TenMon NVARCHAR(255),
	HinhAnh NVARCHAR(255),
	Gia BIGINT,
	TrangThai BIT,
	MaLoaiMon NVARCHAR(10),
	FOREIGN KEY (MaLoaiMon) REFERENCES LoaiMon(MaLoaiMon)
);

CREATE TABLE KhachHang (
	MaKhachHang NVARCHAR(50) PRIMARY KEY,
	TenKhachHang NVARCHAR(255),
	NgaySinh DATE,
	GioiTinh NVARCHAR(255),
	ChiTieu BIGINT,
	SDT NVARCHAR(10) UNIQUE,
	NgayDangKy date
);

CREATE TABLE NhaCungCap (
	MaNCC NVARCHAR(50) PRIMARY KEY,
	TenNCC NVARCHAR(255),
	DiaChi NVARCHAR(255),
	SDT NVARCHAR(10) UNIQUE
);

CREATE TABLE NguyenLieu (
	MaNguyenLieu NVARCHAR(50) PRIMARY KEY,
	TenNguyenLieu NVARCHAR(255),
	--KhoiLuong FLOAT,
	DonVi NVARCHAR(255),
	TrangThai BIT
);

CREATE TABLE NguyenLieuKho (
	MaNguyenLieu NVARCHAR(50),
	KhoiLuong FLOAT,
	MaChiNhanh NVARCHAR(10),
	PRIMARY KEY (MaNguyenLieu, MaChiNhanh), 
	FOREIGN KEY (MaNguyenLieu) REFERENCES NguyenLieu(MaNguyenLieu)
);

CREATE TABLE KhuyenMai (
	MaKhuyenMai NVARCHAR(50) PRIMARY KEY,
	TenKhuyenMai NVARCHAR(255),
	PhanTram INT,
	NgayBatDau DATE,
	NgayKetThuc DATE,
	ChiTieu BIGINT,
	isMember BIT
);

CREATE TABLE CaLam (
	MaCaLam NVARCHAR(50) PRIMARY KEY,
	TenCaLam NVARCHAR(255),
	ThoiGianVao TIME(0),
	ThoiGianRa TIME(0),
	TrangThai BIT
);

CREATE TABLE PhanQuyen (
	MaPhanQuyen NVARCHAR(10) PRIMARY KEY,
	TenQuyen NVARCHAR(255),
	BanHang BIT,
	KhachHang BIT,
	NhapHang BIT,
	XuatKho BIT,
	Mon BIT,
	NguyenLieu BIT,
	LichLam BIT,
	KhuyenMaiUuDai BIT,
	NhaCungCap BIT,
	NhanVien BIT,
	ThongKe BIT,
	DoUuTien INT,
	TrangThai BIT
);

CREATE TABLE NhanVien (
	MaNhanVien NVARCHAR(50) PRIMARY KEY,
	TenNhanVien NVARCHAR(255),
	GioiTinhNhanVien NVARCHAR(255),
	SoDienThoaiNhanVien NVARCHAR(255),
	NgaySinhNhanVien DATE,
	ChucVuNhanVien NVARCHAR(255),
	DiaChi NVARCHAR(255),
	LuongNhanVien BIGINT,
	TrangThaiNhanVien BIT,
	MaChiNhanh NVARCHAR(10),
	NgayNghiViec DATE,
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh)
);

CREATE TABLE LichLam (
	MaCaLam nvarchar(50) ,
	MaNhanVien nvarchar(50),
	MaChiNhanh nvarchar(10),
	NgayLam date,
	PRIMARY KEY (MaCaLam, MaNhanVien, NgayLam), 
	FOREIGN KEY (MaCaLam) REFERENCES CaLam(MaCaLam),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

CREATE TABLE TaiKhoan (
	MaTaiKhoan NVARCHAR(50) PRIMARY KEY,
	TenDangNhap NVARCHAR(255),
	MatKhau NVARCHAR(255),
	MaPhanQuyen NVARCHAR(10),
	MaNhanVien NVARCHAR(50),
	TrangThai BIT,
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	FOREIGN KEY (MaPhanQuyen) REFERENCES PhanQuyen(MaPhanQuyen)
);

CREATE TABLE HoaDon (
	MaHoaDon NVARCHAR(255) PRIMARY KEY,
	NgayLapHoaDon DATE,
	TongTienHoaDon BIGINT,
	MaNhanVien NVARCHAR(50),
	MaKhachHang NVARCHAR(50),
	MaKhuyenMai NVARCHAR(50),
	MaKhuyenMaiMember NVARCHAR(50),
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
	FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai),
	FOREIGN KEY (MaKhuyenMaiMember) REFERENCES KhuyenMai(MaKhuyenMai)
);

CREATE TABLE ChiTietHoaDon (
	MaHoaDon NVARCHAR(255),
	MaMon NVARCHAR(10),
	DonGia BIGINT,
	ThanhTien INT,
	SoLuong INT,
	PRIMARY KEY (MaHoaDon, MaMon),
	FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
	FOREIGN KEY (MaMon) REFERENCES Mon(MaMon)
);

CREATE TABLE PhieuNhap (
	MaPhieuNhap NVARCHAR(255) PRIMARY KEY,
	NgayLapPhieuNhap DATE,
	TongTienPhieuNhap BIGINT,
	MaNhanVien NVARCHAR(50),
	MaNCC NVARCHAR(50),
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	FOREIGN KEY (MaNCC) REFERENCES NhaCungCap(MaNCC)
);

CREATE TABLE ChiTietPhieuNhap (
	MaPhieuNhap NVARCHAR(255),
	MaNguyenLieu NVARCHAR(50),
	KhoiLuong FLOAT,
	DonGia BIGINT,
	ThanhTien BIGINT,
	PRIMARY KEY (MaPhieuNhap, MaNguyenLieu),
	FOREIGN KEY (MaPhieuNhap) REFERENCES PhieuNhap(MaPhieuNhap),
	FOREIGN KEY (MaNguyenLieu) REFERENCES NguyenLieu(MaNguyenLieu)
);

CREATE TABLE PhieuXuatKho (
	MaPhieuXuatKho NVARCHAR(255) PRIMARY KEY,
	NgayLap DATE,
	MaNhanVien NVARCHAR(50),
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

CREATE TABLE ChiTietPhieuXuatKho (
	MaPhieuXuatKho NVARCHAR(255),
	MaNguyenLieu NVARCHAR(50),
	KhoiLuong FLOAT,
	PRIMARY KEY (MaPhieuXuatKho, MaNguyenLieu),
	FOREIGN KEY (MaPhieuXuatKho) REFERENCES PhieuXuatKho(MaPhieuXuatKho),
	FOREIGN KEY (MaNguyenLieu) REFERENCES NguyenLieu(MaNguyenLieu)
);