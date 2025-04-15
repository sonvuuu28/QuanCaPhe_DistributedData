use QuanCaPhe

INSERT INTO ChiNhanh (MaChiNhanh, TenChiNhanh, DiaChi, TrangThai) VALUES
('CN001', N'Chi nhánh Hồ Chí Minh', N'123 Đường Nguyễn Trãi, TP.HCM', 1),
('CN002', N'Chi nhánh Hà Nội', N'456 Đường Lê Lợi, Hà Nội', 1);

INSERT INTO LoaiMon (MaLoaiMon, TenLoaiMon, TrangThai) VALUES
('LM001', N'Sinh tố', 1),
('LM002', N'Cà phê', 1),
('LM003', N'Trà trái cây', 1),
('LM004', N'Nước khác', 1);

INSERT INTO Mon (MaMon, TenMon, HinhAnh, Gia, TrangThai, MaLoaiMon) VALUES
('M001', N'Latte', N'latte.jpg', 35000, 1, 'LM004'),
('M002', N'Cà phê đen', N'caPheDen.jpg', 25000, 1, 'LM002'),
('M003', N'Cà phê trứng', N'caPheTrung.jpg', 40000, 1, 'LM002'),
('M004', N'Sinh tố bơ', N'sinhToBo.jpg', 40000, 1, 'LM001'),
('M005', N'Cà phê muối', N'caPheMuoi.jpg', 35000, 1, 'LM002'),
('M006', N'Ép ổi', N'epOi.jpg', 35000, 1, 'LM004'),
('M007', N'Trà ổi', N'traOi.jpg', 35000, 1, 'LM003'),
('M008', N'Trà dâu tây', N'traDauTay.jpg', 35000, 1, 'LM003'),
('M009', N'Trà xanh', N'traXanh.jpg', 30000, 1, 'LM004'),
('M010', N'Cappuccino', N'cappuccino.jpg', 35000, 1, 'LM002');

INSERT INTO KhachHang (MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, ChiTieu, SDT, NgayDangKy) VALUES
('KH001', N'Nguyễn Thị Rô', '1965-06-15', N'Nữ', 18600000, '0987654321', '2025-03-10'),
('KH002', N'Trần Thị Thảo', '1988-09-22', N'Nữ', 4000000, '0978654321', '2025-02-09'),
('KH003', N'Phạm Hoàng Tuấn', '2000-12-01', N'Nam', 1200000, '0965456789', '2025-02-10'),
('KH004', N'Lê Gia Bảo', '1993-04-17', N'Nam', 200000, '0943567890', '2025-03-10');

INSERT INTO NhaCungCap (MaNCC, TenNCC, DiaChi, SDT) VALUES
('NCC001', N'Công ty Sữa Việt Nam', N'Quận 1, TP.HCM', '0901234567'),
('NCC002', N'Nhà máy Cà Phê Trung Nguyên', N'Buôn Ma Thuột, Đắk Lắk', '0912345678'),
('NCC003', N'Xưởng Bánh Ngọt Sài Gòn', N'Quận Bình Thạnh, TP.HCM', '0923456789'),
('NCC004', N'Siêu thị Co.opmart', N'189 Cống Quỳnh, Quận 1, Tp.HCM', '0283835239'),
('NCC005', N'Cửa hàng trái cây xanh', N'787 Lũy Bán Bích, Tân Phú, Tp.HCM', '0964428039');

INSERT INTO NguyenLieu (MaNguyenLieu, TenNguyenLieu, DonVi, TrangThai) VALUES
('NL001', N'Sữa tươi', N'Lit', 1),
('NL002', N'Bột cà phê', N'Kg', 1),
('NL003', N'Bột trà xanh', N'Kg', 1),
('NL004', N'Dâu tây', N'Kg', 1),
('NL005', N'Ổi', N'Kg', 1),
('NL006', N'Đường', N'Kg', 1),
('NL007', N'Kem tươi', N'Kg', 1);

UPDATE NguyenLieuKho
SET KhoiLuong = CASE 
    WHEN MaNguyenLieu = 'NL001' AND MaChiNhanh = 'CN001' THEN 5
    WHEN MaNguyenLieu = 'NL002' AND MaChiNhanh = 'CN001' THEN 5
    WHEN MaNguyenLieu = 'NL003' AND MaChiNhanh = 'CN001' THEN 2
    WHEN MaNguyenLieu = 'NL004' AND MaChiNhanh = 'CN001' THEN 3.5
    WHEN MaNguyenLieu = 'NL005' AND MaChiNhanh = 'CN001' THEN 5
    WHEN MaNguyenLieu = 'NL006' AND MaChiNhanh = 'CN001' THEN 2
    WHEN MaNguyenLieu = 'NL007' AND MaChiNhanh = 'CN001' THEN 3
    WHEN MaNguyenLieu = 'NL001' AND MaChiNhanh = 'CN002' THEN 7
    WHEN MaNguyenLieu = 'NL002' AND MaChiNhanh = 'CN002' THEN 5.5
    WHEN MaNguyenLieu = 'NL003' AND MaChiNhanh = 'CN002' THEN 2
    WHEN MaNguyenLieu = 'NL004' AND MaChiNhanh = 'CN002' THEN 3
    ELSE KhoiLuong
END
WHERE (MaNguyenLieu = 'NL001' AND MaChiNhanh = 'CN001') 
   OR (MaNguyenLieu = 'NL002' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL003' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL004' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL005' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL006' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL007' AND MaChiNhanh = 'CN001')
   OR (MaNguyenLieu = 'NL001' AND MaChiNhanh = 'CN002')
   OR (MaNguyenLieu = 'NL002' AND MaChiNhanh = 'CN002')
   OR (MaNguyenLieu = 'NL003' AND MaChiNhanh = 'CN002')
   OR (MaNguyenLieu = 'NL004' AND MaChiNhanh = 'CN002');

INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, PhanTram, NgayBatDau, NgayKetThuc, ChiTieu, isMember) VALUES
('KM001', N'Giảm giá 10% toàn bộ', 10, '2025-01-01', '2025-12-31', 50000, 0),
('KM002', N'Ưu đãi tháng sinh nhật SGUs', 15, '2025-06-01', '2025-06-30', 100000, 0),
('KM003', N'Giảm giá tháng 3', 10, '2025-03-01', '2025-03-31', 25000, 0),
('KM004', N'Khách hàng vàng (1.000.000 VNĐ)', 10, '2025-01-01', '2035-12-31', 1000000,1),
('KM005', N'Khách hàng bạch kim (10.000.000 VNĐ)', 30, '2025-06-01', '2035-06-30', 10000000,1);


INSERT INTO CaLam (MaCaLam, TenCaLam, ThoiGianVao, ThoiGianRa, TrangThai) VALUES
('CL001', N'Ca A', '06:00', '14:00', 1),
('CL002', N'Ca A1', '06:00', '12:00', 1),
('CL003', N'Ca B', '14:00', '22:00', 1),
('CL004', N'Ca B1', '17:00', '22:00', 1),
('CL005', N'Ca B2', '10:00', '18:00', 1);

IF NOT EXISTS (SELECT 1 FROM CaLam WHERE MaCaLam = 'CLOFF')
BEGIN
    INSERT INTO CaLam (MaCaLam, TenCaLam, ThoiGianVao, ThoiGianRa)
    VALUES ('CLOFF', N'', NULL, NULL);
END;

INSERT INTO PhanQuyen (MaPhanQuyen, TenQuyen, BanHang, KhachHang, NhapHang, XuatKho, Mon, NguyenLieu, LichLam, KhuyenMaiUuDai, NhaCungCap, NhanVien, ThongKe, TrangThai, DoUuTien) VALUES
('PQ001', 'Admin', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0),
('PQ002', N'Quản lý chi nhánh', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),
('PQ003', N'Nhân viên bán hàng', 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2);

INSERT INTO NhanVien (MaNhanVien, TenNhanVien, GioiTinhNhanVien, SoDienThoaiNhanVien, NgaySinhNhanVien, ChucVuNhanVien, DiaChi, LuongNhanVien, TrangThaiNhanVien, MaChiNhanh, NgayNghiViec) VALUES
('NV001', N'Trần Văn Trung', 'Nam', '0912345678', '1975-05-20', N'Chủ', N'123 Lê Văn Sỹ, Quận 3, TP.HCM', 0, 1, null, null),
('NV002', N'Nguyễn Hoàng Phong', N'Nam', '0987654321', '1995-10-15', N'Quản lý chi nhánh', N'45 Nguyễn Huệ, Quận 1, TP.HCM', 10000000, 1, 'CN001', null),
('NV003', N'Lê Thị Loan', N'Nữ', '0886486123', '2000-11-08', N'Quản lý chi nhánh', N'12 Lý Thường Kiệt, Hoàn Kiếm, Hà Nội', 10000000, 1, 'CN002', null),
('NV004', N'Vũ Thiên Sơn', N'Nam', '0825143790', '2004-01-28', N'Nhân viên', N'78 Trần Quang Khải, Quận 1, TP.HCM', 7000000, 1, 'CN001', null), 
('NV005', N'Phạm Minh Nhật', N'Nam', '0911223344', '2002-09-12', N'Nhân viên', N'90 Nguyễn Trãi, Quận 5, TP.HCM', 7000000, 1, 'CN001', null),
('NV006', N'Đặng Thị Kim Ngân', N'Nữ', '0933445566', '2001-06-23', N'Nhân viên', N'22 Hai Bà Trưng, Quận Ngô Quyền, Hải Phòng', 7000000, 0, 'CN001', '2025-03-25'),
('NV007', N'Huỳnh Quốc Đạt', N'Nam', '0909888777', '1999-03-17', N'Nhân viên', N'10 Nguyễn Văn Cừ, TP. Buôn Ma Thuột, Đắk Lắk', 7000000, 1, 'CN002', null),
('NV008', N'Trần Thị Bích Ngọc', N'Nữ', '0977665544', '2003-12-30', N'Nhân viên', N'34 Hoàng Văn Thụ, TP. Nha Trang, Khánh Hòa', 7000000, 1, 'CN002', null),
('NV009', N'Ngô Văn Hưng', N'Nam', '0966888999', '1998-07-05', N'Nhân viên', N'25 Trường Chinh, TP. Vinh, Nghệ An', 7000000, 1, 'CN002', null);

INSERT INTO LichLam (MaCaLam, MaNhanVien, NgayLam, MaChiNhanh) 
VALUES 
('CL001', 'NV002', '2025-04-08', 'CN001'),
('CL001', 'NV003', '2025-04-08', 'CN002'),
('CL002', 'NV002', '2025-05-08', 'CN001'),
('CL002', 'NV003', '2025-05-08', 'CN002'), 
('CL001', 'NV002', '2025-06-08', 'CN001'),
('CL001', 'NV003', '2025-06-08', 'CN002'),
('CL002', 'NV004', '2025-05-08', 'CN001'),
('CL002', 'NV005', '2025-05-08', 'CN001');

INSERT INTO TaiKhoan (MaTaiKhoan, TenDangNhap, MatKhau, MaPhanQuyen, MaNhanVien, TrangThai, MaChiNhanh) VALUES
('TK001', 'sa', '123', 'PQ001', 'NV001', 1, null),
('TK002', 'qlsg', '123', 'PQ002', 'NV002', 1, 'CN001'),
('TK003', 'qlhn', '123', 'PQ002', 'NV003', 1, 'CN002'),
('TK004', 'sg1', '123', 'PQ003', 'NV004', 1, 'CN001'),
('TK005', 'sg2', '123', 'PQ003', 'NV005', 1, 'CN001'),
('TK006', 'sg3', '123', 'PQ003', 'NV006', 0, 'CN001'),
('TK007', 'hn1', '123', 'PQ003', 'NV007', 1, 'CN002'),
('TK008', 'hn2', '123', 'PQ003', 'NV008', 1, 'CN002'),
('TK009', 'hn3', '123', 'PQ003', 'NV009', 1, 'CN002');

INSERT INTO HoaDon (MaHoaDon, NgayLapHoaDon, TongTienHoaDon, MaNhanVien, MaKhachHang, MaKhuyenMai, MaKhuyenMaiMember, MaChiNhanh) VALUES
('HD001', '2025-03-16', 500000, 'NV002', 'KH001', 'KM001', 'KM004', 'CN001'),
('HD002', '2025-03-15', 750000, 'NV002', 'KH002', null, 'KM004', 'CN001'),
('HD003', '2025-03-13', 500000, 'NV002', 'KH003', 'KM001', null, 'CN001'),
('HD004', '2025-03-08', 500000, 'NV003', 'KH004', 'KM001', null, 'CN002'),
('HD005', '2025-03-07', 500000, 'NV003', 'KH001', 'KM001', null, 'CN002'),
('HD006', '2025-02-07', 500000, 'NV003', 'KH002', 'KM001', null, 'CN002'),
('HD007', '2025-03-16', 500000, 'NV002', 'KH003', 'KM001', 'KM004', 'CN001'),
('HD008', '2025-03-15', 200000, 'NV002', 'KH001', null, null, 'CN001'),
('HD009', '2025-03-13', 500000, 'NV002', 'KH001', null, null, 'CN001'),
('HD010', '2025-02-07', 500000, 'NV003', 'KH001', null, null, 'CN002');

INSERT INTO ChiTietHoaDon (MaHoaDon, MaMon, DonGia, ThanhTien, SoLuong) VALUES
('HD001', 'M001', 35000, 175000, 5),
('HD001', 'M002', 35000, 175000, 5),
('HD002', 'M003', 40000, 320000, 8),
('HD003', 'M004', 40000, 200000, 5),
('HD003', 'M005', 35000, 280000, 8),
('HD004', 'M006', 35000, 280000, 8),
('HD005', 'M007', 35000, 280000, 8),
('HD006', 'M008', 35000, 280000, 8);

INSERT INTO PhieuNhap (MaPhieuNhap, NgayLapPhieuNhap, TongTienPhieuNhap, MaNhanVien, MaNCC, MaChiNhanh) VALUES
('PN001', '2025-01-15', 2000000, 'NV002', 'NCC001', 'CN001'),
('PN002', '2025-01-20', 1500000, 'NV004', 'NCC002', 'CN001'),
('PN003', '2025-02-25', 1500000, 'NV005', 'NCC003', 'CN001'),
('PN004', '2025-02-25', 1500000, 'NV003', 'NCC002', 'CN002');

INSERT INTO ChiTietPhieuNhap (MaPhieuNhap, MaNguyenLieu, DonGia, KhoiLuong, ThanhTien) VALUES
('PN001', 'NL001', 38000, 10, 380000),
('PN001', 'NL002', 70000, 5, 700000),
('PN001', 'NL004', 100000, 3.5, 350000),
('PN002', 'NL003', 75000, 1, 75000),
('PN003', 'NL003', 75000, 1, 75000),
('PN003', 'NL005', 20000, 5, 100000),
('PN003', 'NL006', 35000, 2, 70000),
('PN003', 'NL007', 350000, 3, 105000),
('PN004', 'NL001', 38000, 10, 380000),
('PN004', 'NL002', 70000, 5.5, 735000),
('PN004', 'NL003', 100000, 2, 200000),
('PN004', 'NL004', 75000, 3, 225000);

INSERT INTO PhieuXuatKho (MaPhieuXuatKho, NgayLap, MaNhanVien, MaChiNhanh) VALUES
('PXK001', '2025-02-01', 'NV001', 'CN001'),
('PXK002', '2025-02-05', 'NV002', 'CN002');

INSERT INTO ChiTietPhieuXuatKho (MaPhieuXuatKho, MaNguyenLieu, KhoiLuong) VALUES
('PXK001', 'NL001', 5),
('PXK002', 'NL001', 3);

-----select
SELECT * FROM ChiNhanh;
SELECT * FROM LoaiMon;
SELECT * FROM Mon;
SELECT * FROM KhachHang;
SELECT * FROM NhaCungCap;
SELECT * FROM NguyenLieu;
SELECT * FROM NguyenLieuKho;
SELECT * FROM KhuyenMai;
SELECT * FROM CaLam;
SELECT * FROM PhanQuyen;
SELECT * FROM NhanVien;
SELECT * FROM TaiKhoan;
SELECT * FROM HoaDon;
SELECT * FROM ChiTietHoaDon;
SELECT * FROM PhieuNhap;
SELECT * FROM ChiTietPhieuNhap;
SELECT * FROM PhieuXuatKho;
SELECT * FROM ChiTietPhieuXuatKho;
SELECT * FROM LichLam;
