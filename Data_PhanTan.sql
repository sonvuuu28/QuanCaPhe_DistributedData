use QuanCaPhe

--
-- 🏢 DỮ LIỆU MẪU CHO CHI NHÁNH
--
INSERT INTO ChiNhanh (MaChiNhanh, TenChiNhanh, DiaChi, TrangThai) VALUES
('CN001', N'Chi nhánh Hà Nội', N'123 Đường Nguyễn Trãi, Hà Nội', 1),
('CN002', N'Chi nhánh Hồ Chí Minh', N'456 Đường Lê Lợi, TP.HCM', 1),
('CN003', N'Chi nhánh Cần Thơ', N'202 Đường Hùng Vương, Cần Thơ', 1);

--
-- 🏪 DỮ LIỆU MẪU CHO LOẠI MÓN
--
INSERT INTO LoaiMon (MaLoaiMon, TenLoaiMon, TrangThai) VALUES
('LM001', N'Đồ uống', 1),
('LM002', N'Bánh ngọt', 1),
('LM003', N'Bánh mặn', 1),
('LM004', N'Cà phê', 1),
('LM005', N'Trà sữa', 1);

--
-- 🍽 DỮ LIỆU MẪU CHO MÓN
--
INSERT INTO Mon (MaMon, TenMon, HinhAnh, Gia, TrangThai, MaLoaiMon) VALUES
('M001', N'Latte', N'latte.jpg', 30000, 1, 'LM005'),
('M002', N'Cà phê đen', N'caPheDen.jpg', 50000, 1, 'LM002'),
('M003', N'Cà phê trứng', N'caPheTrung.jpg', 25000, 1, 'LM004'),
('M004', N'Sinh tố bơ', N'sinhToBo.jpg', 40000, 1, 'LM001'),
('M005', N'Cà phê muối', N'caPheMuoi.jpg', 35000, 1, 'LM003'),
('M006', N'Ép ổi', N'epOi.jpg', 30000, 1, 'LM005'),
('M007', N'Trà ổi', N'traOi.jpg', 50000, 1, 'LM002'),
('M008', N'Trà dâu tây', N'traDauTay.jpg', 25000, 1, 'LM004'),
('M009', N'Trà xanh', N'traXanh.jpg', 40000, 1, 'LM001'),
('M010', N'Cappuccino', N'cappuccino.jpg', 35000, 1, 'LM003');

--
-- 👥 DỮ LIỆU MẪU CHO KHÁCH HÀNG
--
INSERT INTO KhachHang (MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, ChiTieu, SDT, NgayDangKy) VALUES
('KH001', N'Nguyễn Văn A', '1995-06-15', N'Nam', 2000000, '0987654321', '2025-03-10'),
('KH002', N'Trần Thị B', '1998-09-22', N'Nữ', 1500000, '0978654321', '2025-02-09'),
('KH003', N'Phạm Văn C', '2000-12-01', N'Nam', 1200000, '0965456789', '2025-03-10'),
('KH004', N'Lê Thị D', '1993-04-17', N'Nữ', 3000000, '0943567890', '2025-03-10');

--
-- 🏭 DỮ LIỆU MẪU CHO NHÀ CUNG CẤP
--
INSERT INTO NhaCungCap (MaNCC, TenNCC, DiaChi, SDT) VALUES
('NCC001', N'Công ty Sữa Việt Nam', N'Quận 1, TP.HCM', '0901234567'),
('NCC002', N'Nhà máy Cà Phê Trung Nguyên', N'Buôn Ma Thuột, Đắk Lắk', '0912345678'),
('NCC003', N'Xưởng Bánh Ngọt Sài Gòn', N'Quận Bình Thạnh, TP.HCM', '0923456789'),
('NCC004', N'Nhà phân phối Đồ Uống Hà Nội', N'Cầu Giấy, Hà Nội', '0934567890'),
('NCC005', N'Xưởng Bánh Mì Đà Nẵng', N'Hải Châu, Đà Nẵng', '0945678901');

--
-- 🛠 DỮ LIỆU MẪU CHO NGUYÊN LIỆU
--
INSERT INTO NguyenLieu (MaNguyenLieu, TenNguyenLieu, DonVi, TrangThai) VALUES
('NL001', N'Sữa tươi', N'Lit', 1),
('NL002', N'Bột cà phê', N'Kg', 1),
('NL003', N'Bột trà xanh', N'Kg', 1),
('NL004', N'Kem tươi', N'Kg', 1);

INSERT INTO NguyenLieuKho (MaNguyenLieu, KhoiLuong, MaChiNhanh) VALUES
('NL001', 10, 'CN001'),
('NL002', 5, 'CN001'),
('NL003', 2, 'CN001'),
('NL004', 3, 'CN001'),
('NL001', 10, 'CN002'),
('NL002', 5, 'CN002'),
('NL003', 2, 'CN002'),
('NL004', 3, 'CN002'),
('NL001', 10, 'CN003'),
('NL002', 5, 'CN003'),
('NL003', 2, 'CN003'),
('NL004', 3, 'CN003');

INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, PhanTram, NgayBatDau, NgayKetThuc, ChiTieu, isMember) VALUES
('KM001', N'Giảm giá 10% toàn bộ', 10, '2025-01-01', '2025-12-31', 50000, 0),
('KM002', N'Ưu đãi tháng sinh nhật', 15, '2025-06-01', '2025-06-30', 100000, 0),
('KM003', N'Mua 1 tặng 1 cà phê', 50, '2025-03-01', '2025-03-31', 25000, 0),
('KM004', N'Khách hàng vàng (1.000.000 VNĐ)', 5, '2025-01-01', '2035-12-31', 1000000,1),
('KM005', N'Khách hàng bạch kim (10.000.000 VNĐ)', 15, '2025-06-01', '2035-06-30', 1000000,1);


INSERT INTO CaLam (MaCaLam, TenCaLam, ThoiGianVao, ThoiGianRa, TrangThai) VALUES
('CL001', N'Ca sáng', '06:00', '14:00', 1),
('CL002', N'Ca chiều', '14:00', '22:00', 1),
('CL003', N'Ca đêm', '22:00', '06:00', 1),
('CL004', N'Ca linh động 1', '08:00', '16:00', 1),
('CL005', N'Ca linh động 2', '10:00', '18:00', 1);


IF NOT EXISTS (SELECT 1 FROM CaLam WHERE MaCaLam = 'CLOFF')
BEGIN
    INSERT INTO CaLam (MaCaLam, TenCaLam, ThoiGianVao, ThoiGianRa)
    VALUES ('CLOFF', N'', NULL, NULL);
END;

--
-- 🔐 QUẢN LÝ TÀI KHOẢN & NHÂN VIÊN
--
INSERT INTO PhanQuyen (MaPhanQuyen, TenQuyen, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KhuyenMaiUuDai, NhaCungCap, NhanVien, ThongKe, TrangThai) VALUES
('PQ001', 'Admin', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
('PQ002', 'Nhân viên bán hàng', 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1);

INSERT INTO NhanVien (MaNhanVien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, ChucVuNhanVien, DiaChi, LuongNhanVien, TrangThaiNhanVien, MaChiNhanh, NgayNghiViec) VALUES
('NV001', N'Nguyễn Văn A', 'Nam', '0912345678', '1990-05-20', N'Quản lý', N'Hà Nội', 15000000, 1, 'CN001', null),
('NV002', N'Trần Thị B', N'Nữ', '0987654321', '1995-10-15', N'Nhân viên', N'Hồ Chí Minh', 10000000, 1, 'CN002', null),
('NV003', N'Nguyễn Trãi', N'Nam', '0886486123', '2000-11-08', N'Nhân viên', N'Hà Nội', 10000000, 0, 'CN002', '2025-01-01'),
('NV004', N'Vũ Thiên Sơn', N'Nam', '0825143790', '2004-01-28', N'Nhân viên', N'Hồ Chí Minh', 10000000, 1, 'CN002', null);

INSERT INTO [LichLam] ([MaCaLam], [MaNhanVien], [NgayLam]) 
VALUES 
('CL001', 'NV001', '2024-03-04'),
('CL001', 'NV002', '2024-09-28');


INSERT INTO TaiKhoan (MaTaiKhoan, TenDangNhap, MatKhau, MaPhanQuyen, MaNhanVien, TrangThai, MaChiNhanh) VALUES
('TK001', 'admin', '123456', 'PQ001', 'NV001', 1, 'CN001'),
('TK002', 'nhanvien1', '654321', 'PQ002', 'NV002', 1, 'CN002');

--
-- 🛒 QUẢN LÝ BÁN HÀNG
--
INSERT INTO HoaDon (MaHoaDon, NgayLapHoaDon, TongTienHoaDon, MaNhanVien, MaKhachHang, MaKhuyenMai, MaKhuyenMaiMember, MaChiNhanh) VALUES
('HD001', '2025-03-16', 500000, 'NV002', 'KH001', 'KM001', 'KM004', 'CN001'),
('HD002', '2025-03-15', 750000, 'NV001', 'KH002', null, 'KM004', 'CN002'),
('HD003', '2025-03-13', 500000, 'NV002', 'KH001', 'KM001', null, 'CN002'),
('HD004', '2025-03-08', 500000, 'NV002', 'KH001', 'KM001', null, 'CN002'),
('HD005', '2025-03-07', 500000, 'NV002', 'KH001', 'KM001', null, 'CN002'),
('HD006', '2025-02-07', 500000, 'NV002', 'KH001', 'KM001', null, 'CN002');

INSERT INTO ChiTietHoaDon (MaHoaDon, MaMon, DonGia, ThanhTien, SoLuong) VALUES
('HD001', 'M001', 100000, 200000, 2),
('HD001', 'M002', 150000, 300000, 2),
('HD002', 'M003', 250000, 750000, 3),
('HD003', 'M001', 150000, 300000, 2),
('HD003', 'M004', 150000, 300000, 2),
('HD004', 'M001', 150000, 300000, 2),
('HD005', 'M004', 150000, 300000, 2),
('HD006', 'M003', 250000, 750000, 3);

--
-- 📦 QUẢN LÝ NHẬP XUẤT KHO
--
INSERT INTO PhieuNhap (MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNCC, MaChiNhanh) VALUES
('PN001', '2024-01-15', 2000000, 'NV001', 'NCC001', 'CN001'),
('PN002', '2024-01-20', 1500000, 'NV002', 'NCC002', 'CN002'),
('PN003', '2024-02-25', 1500000, 'NV002', 'NCC002', 'CN002');

INSERT INTO ChiTietPhieuNhap (MaPhieuNhap, MaNguyenLieu, DonGia, KhoiLuong, ThanhTien) VALUES
('PN001', 'NL001', 50000, 10, 500000),
('PN001', 'NL002', 100000, 10, 1000000),
('PN002', 'NL003', 75000, 10, 750000),
('PN003', 'NL003', 50000, 10, 500000),
('PN003', 'NL004', 100000, 10, 1000000);

INSERT INTO PhieuXuatKho (MaPhieuXuatKho, NgayLap, MaNhanVien, MaChiNhanh) VALUES
('PXK001', '2024-02-01', 'NV001', 'CN001'),
('PXK002', '2024-02-05', 'NV002', 'CN002');

INSERT INTO ChiTietPhieuXuatKho (MaPhieuXuatKho, MaNguyenLieu, KhoiLuong) VALUES
('PXK001', 'NL001', 5),
('PXK002', 'NL003', 3);

-----select
SELECT * FROM ChiNhanh;

SELECT * FROM LoaiMon;

SELECT * FROM Mon;

SELECT * FROM KhachHang;

SELECT * FROM NhaCungCap;

SELECT * FROM NguyenLieu;
SELECT * FROM NguyenLieuKho;
y
select * from KhuyenMai

SELECT * FROM CaLam;

SELECT * FROM PhanQuyen;

SELECT * FROM NhanVien

SELECT * FROM [TaiKhoan];

SELECT * FROM [HoaDon];

SELECT * FROM [ChiTietHoaDon];

SELECT * FROM [PhieuNhap];

SELECT * FROM [ChiTietPhieuNhap];

SELECT * FROM PhieuXuatKho;

SELECT * FROM [ChiTietPhieuXuatKho];

select * from lichlam

