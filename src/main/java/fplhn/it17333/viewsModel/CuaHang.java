package fplhn.it17333.viewsModel;

import fplhn.it17333.Entity.CuaHangEntity;
import jakarta.validation.constraints.NotBlank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class CuaHang {
    @NotBlank(message = "Không được để trống")
    private String Ma;
    @NotBlank(message = "Không được để trống")
    private String Ten;
    @NotBlank
    private String DiaChi;
    @NotBlank
    private String ThanhPho;
    @NotBlank
    private String QuocGia;

    public CuaHang() {
    }

    public CuaHang(String ma, String ten, String diaChi, String thanhPho, String quocGia) {
        Ma = ma;
        Ten = ten;
        DiaChi = diaChi;
        ThanhPho = thanhPho;
        QuocGia = quocGia;
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

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String thanhPho) {
        ThanhPho = thanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String quocGia) {
        QuocGia = quocGia;
    }
    public void loadFromEntity(CuaHangEntity ch)
    {
        this.setMa( ch.getMa() );
        this.setTen( ch.getTen() );
        this.setThanhPho( ch.getThanhPho() );
        this.setQuocGia( ch.getQuocGia() );
        this.setDiaChi( ch.getDiaChi() );
    }

}
