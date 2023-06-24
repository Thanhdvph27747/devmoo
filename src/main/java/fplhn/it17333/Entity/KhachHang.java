package fplhn.it17333.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.sql.Date;
import java.util.UUID;

@Table(name = "KhachHang")
@Entity(name = "KhachHang")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhachHang {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ho")
    private String Ho;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "NgaySinh")
    private Date NgaySinh;

    @Column(name = "Sdt")
    private String Sdt;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "QuocGia")
    private String QuocGia;

    public void loadFromVM(fplhn.it17333.viewsModel.KhachHang kh ){
        this.setMa(kh.getMa());
        this.setTen(kh.getTen());
        this.setHo(kh.getHo());
        this.setNgaySinh(kh.getNgaySinh());
        this.setSdt(kh.getSdt());
        this.setDiaChi(kh.getDiaChi());
        this.setQuocGia(kh.getQuocGia());

    }
}
