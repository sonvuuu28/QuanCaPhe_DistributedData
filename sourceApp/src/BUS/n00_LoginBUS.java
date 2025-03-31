package BUS;

import DAO.n00_LoginDAO;
import DTO.NhanVienDTO;
import DTO.PhanQuyenDTO;

public class n00_LoginBUS {

    public static n00_LoginBUS getInstance() {
        return new n00_LoginBUS();
    }

    public NhanVienDTO getNhanVienFromTaiKhoan(String tenTK, String mk) {
        NhanVienDTO nv = n00_LoginDAO.getInstance().getNhanVienFromTaiKhoan(tenTK, mk);
        return nv;
    }

    public PhanQuyenDTO getPhanQuyenFromTaiKhoan(String tenTK, String mk) {
        PhanQuyenDTO nv = n00_LoginDAO.getInstance().getPhanQuyenFromTaiKhoan(tenTK, mk);
        return nv;
    }

}
