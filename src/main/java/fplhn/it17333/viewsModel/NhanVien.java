package fplhn.it17333.viewsModel;

import fplhn.it17333.Entity.NhanVienEntity;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


public class NhanVien {
    @NotBlank(message = "*Không được để trống!")
    private String Ma;
    @NotBlank(message = "*Không được để trống!")
    private String Ten;
    @NotBlank(message = "*Không được để trống!")
    private String Ho;
    @NotBlank(message = "*Không được để trống!")
    private String GioiTinh;
    @NotBlank(message = "*Không được để trống!")
    private String NgaySinh;
    @NotBlank(message = "*Không được để trống!")
    private String DiaChi;
    @NotBlank(message = "*Không được để trống!")
    private String Sdt;
    @NotBlank(message = "*Không được để trống!")
    private String MatKhau;

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, String ho, String gioiTinh, String ngaySinh, String diaChi, String sdt, String matKhau) {
        Ma = ma;
        Ten = ten;
        Ho = ho;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
        Sdt = sdt;
        MatKhau = matKhau;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String ho) {
        Ho = ho;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String sdt) {
        Sdt = sdt;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public void loadFromEmtity(NhanVienEntity vm){
        this.setMa( vm.getMa());
        this.setTen(vm.getTen());
        this.setHo(vm.getHo());
        this.setGioiTinh(vm.getGioiTinh());
        this.setNgaySinh(vm.getNgaySinh());
        this.setSdt(vm.getSdt());
        this.setDiaChi(vm.getDiaChi());
        this.setMatKhau(vm.getMatKhau());

    }
}
