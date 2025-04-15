
- Ngày bắt dầu làm việc cho nhân viên


/*
[MaChiNhanh] = 'CN001'

Chi nhánh
Tài khoản
Nhân viên
Hóa đơn
Phiếu nhập 
Phiếu xuất
Lịch làm
Nguyên liệu kho
3 cái chi tiết

--NODE1
use QuanCaPhe


select * from NguyenLieuKho
select * from LINK.QuanCaPhe.dbo.NguyenLieuKho


--SERVER
use QuanCaPhe
select * from NguyenLieu
select * from LINK.QuanCaPhe.dbo.NguyenLieu











select count(*) sl from LINK.QuanCaPhe.dbo.LichLam where NgayLam = '2025-04-15' and MaChiNhanh = 'CN001'


select * from LichLam

delete from LichLam where MaChiNhanh = 'null'


DECLARE @start DATE = '2025-04-09';

SELECT 
    nv.TenNhanVien,
    COALESCE(c2.TenCaLam, '') AS thu2,
    COALESCE(c3.TenCaLam, '') AS thu3,
    COALESCE(c4.TenCaLam, '') AS thu4,
    COALESCE(c5.TenCaLam, '') AS thu5,
    COALESCE(c6.TenCaLam, '') AS thu6,
    COALESCE(c7.TenCaLam, '') AS thu7,
    COALESCE(c8.TenCaLam, '') AS chunhat
FROM 
    LINK.QuanCaPhe.dbo.NhanVien nv
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = @start) AS t2 ON nv.MaNhanVien = t2.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 1, @start)) AS t3 ON nv.MaNhanVien = t3.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 2, @start)) AS t4 ON nv.MaNhanVien = t4.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 3, @start)) AS t5 ON nv.MaNhanVien = t5.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 4, @start)) AS t6 ON nv.MaNhanVien = t6.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 5, @start)) AS t7 ON nv.MaNhanVien = t7.MaNhanVien
LEFT JOIN 
    (SELECT * FROM LINK.QuanCaPhe.dbo.LichLam WHERE NgayLam = DATEADD(DAY, 6, @start)) AS cn ON nv.MaNhanVien = cn.MaNhanVien
LEFT JOIN CaLam AS c2 ON t2.MaCaLam = c2.MaCaLam
LEFT JOIN CaLam AS c3 ON t3.MaCaLam = c3.MaCaLam
LEFT JOIN CaLam AS c4 ON t4.MaCaLam = c4.MaCaLam
LEFT JOIN CaLam AS c5 ON t5.MaCaLam = c5.MaCaLam
LEFT JOIN CaLam AS c6 ON t6.MaCaLam = c6.MaCaLam
LEFT JOIN CaLam AS c7 ON t7.MaCaLam = c7.MaCaLam
LEFT JOIN CaLam AS c8 ON cn.MaCaLam = c8.MaCaLam
WHERE 
    -- Nếu xem lịch tương lai, chỉ lấy nhân viên chưa nghỉ
    (@start >= GETDATE() AND nv.NgayNghiViec IS NULL)
    -- Nếu xem lịch quá khứ, vẫn lấy nhân viên đã nghỉ nhưng có ca làm
    OR (@start < GETDATE() AND EXISTS (
        SELECT 1 FROM LichLam WHERE LichLam.MaNhanVien = nv.MaNhanVien AND NgayLam >= @start AND NgayLam < DATEADD(DAY, 7, @start)
    )) and nv.MaChiNhanh = 'CN0001'
ORDER BY nv.MaNhanVien;

print ('hello')