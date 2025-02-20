--create database QuanCaPhe
use QuanCaPhe
--
-- 🏢 DANH MỤC CHÍNH
--
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
	FOREIGN KEY (MaLoaiMon) REFERENCES LoaiMon(MaLoaiMon) ON DELETE CASCADE
);

CREATE TABLE KhachHang (
	MaKhachHang NVARCHAR(50) PRIMARY KEY,
	TenKhachHang NVARCHAR(255),
	NgaySinh DATE,
	GioiTinh NVARCHAR(255),
	ChiTieu BIGINT,
	SDT NVARCHAR(10) UNIQUE
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
	KhoiLuong FLOAT,
	DonVi NVARCHAR(255),
	DonGia BIGINT,
	TrangThai BIT
);

CREATE TABLE KhuyenMai (
	MaKhuyenMai NVARCHAR(50) PRIMARY KEY,
	TenKhuyenMai NVARCHAR(255),
	PhanTram INT,
	NgayBatDau DATE,
	NgayKetThuc DATE,
	DieuKien BIGINT
);

CREATE TABLE UuDaiThanhVien (
	MaUuDai NVARCHAR(50) PRIMARY KEY,
	TenUuDai NVARCHAR(255),
	PhanTram INT,
	NgayBatDau DATE,
	NgayKetThuc DATE,
	DieuKien BIGINT
);

CREATE TABLE CaLam (
	MaCaLam NVARCHAR(50) PRIMARY KEY,
	TenCaLam NVARCHAR(255),
	ThoiGianVao TIME(0),
	ThoiGianRa TIME(0),
	TrangThai BIT
);

--
-- 🔐 QUẢN LÝ TÀI KHOẢN & NHÂN VIÊN
--
CREATE TABLE PhanQuyen (
	MaPhanQuyen NVARCHAR(255) PRIMARY KEY,
	TenQuyen NVARCHAR(255),
	QuyenKhachHang BIT,
	QuyenBanHang BIT,
	QuyenNhapHang BIT,
	QuyenMon BIT,
	QuyenNguyenLieu BIT,
	QuyenLichLam BIT,
	QuyenKhuyenMaiUuDai BIT,
	QuyenNhaCungCap BIT,
	QuyenNhanVien BIT,
	QuyenThongKe BIT,
	TrangThaiPhanQuyen BIT
);

CREATE TABLE NhanVien (
	MaNhanVien NVARCHAR(50) PRIMARY KEY,
	TenNhanVien NVARCHAR(255),
	GioiTinhNhanVien NVARCHAR(255),
	SoDienThoaiNhanVien NVARCHAR(255),
	NgaySinhNhanVien DATE,
	ChucVuNhanVien NVARCHAR(255),
	DiaChi NVARCHAR(255),
	LuongNhanVien INT,
	TrangThaiNhanVien BIT,
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh)
);

CREATE TABLE TaiKhoan (
	MaTaiKhoan NVARCHAR(50) PRIMARY KEY,
	TenDangNhap NVARCHAR(255),
	MatKhau NVARCHAR(255),
	MaPhanQuyen NVARCHAR(255),
	MaNhanVien NVARCHAR(50),
	NgayCap DATE,
	NgayNghiViec DATE,
	TrangThaiTaiKhoan BIT,
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	FOREIGN KEY (MaPhanQuyen) REFERENCES PhanQuyen(MaPhanQuyen)
);

--
-- 🛒 QUẢN LÝ BÁN HÀNG
--
CREATE TABLE HoaDon (
	MaHoaDon NVARCHAR(255) PRIMARY KEY,
	NgayLapHoaDon DATE,
	TongTienHoaDon INT,
	MaNhanVien NVARCHAR(50),
	MaKhachHang NVARCHAR(50),
	MaUuDai NVARCHAR(50),
	MaKhuyenMai NVARCHAR(50),
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
	FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
	FOREIGN KEY (MaUuDai) REFERENCES UuDaiThanhVien(MaUuDai),
	FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);

CREATE TABLE ChiTietHoaDon (
	MaHoaDon NVARCHAR(255),
	MaMon NVARCHAR(10),
	DonGia INT,
	ThanhTien INT,
	SoLuong INT,
	PRIMARY KEY (MaHoaDon, MaMon),
	FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon) ON DELETE CASCADE,
	FOREIGN KEY (MaMon) REFERENCES Mon(MaMon)
);

--
-- 📦 QUẢN LÝ NHẬP XUẤT KHO
--
CREATE TABLE PhieuNhap (
	MaPhieuNhap NVARCHAR(255) PRIMARY KEY,
	NgayLapPhieuNhap DATE,
	TongTienPhieuNhap INT,
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
	DonGia INT,
	ThanhTien INT,
	KhoiLuong FLOAT,
	PRIMARY KEY (MaPhieuNhap, MaNguyenLieu),
	FOREIGN KEY (MaPhieuNhap) REFERENCES PhieuNhap(MaPhieuNhap),
	FOREIGN KEY (MaNguyenLieu) REFERENCES NguyenLieu(MaNguyenLieu)
);

CREATE TABLE PhieuXuatKho (
	MaPhieuXuatKho NVARCHAR(255) PRIMARY KEY,
	NgayLapMaPhieuXuatKho DATE,
	MaNhanVien NVARCHAR(50),
	MaChiNhanh NVARCHAR(10),
	FOREIGN KEY (MaChiNhanh) REFERENCES ChiNhanh(MaChiNhanh),
	FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

CREATE TABLE ChiTietPhieuXuatKho (
	MaPhieuXuatKho NVARCHAR(255),
	MaNguyenLieu NVARCHAR(50),
	KhoiLuong FLOAT,
	DonVi NVARCHAR(255),
	PRIMARY KEY (MaPhieuXuatKho, MaNguyenLieu),
	FOREIGN KEY (MaPhieuXuatKho) REFERENCES PhieuXuatKho(MaPhieuXuatKho),
	FOREIGN KEY (MaNguyenLieu) REFERENCES NguyenLieu(MaNguyenLieu)
);
