package fplhn.it17333.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import fplhn.it17333.viewsModel.ChiTietSPVM;
import java.util.UUID;

@Table(name = "ChiTietSP")
@Entity(name = "ChiTietSP")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSP {
    @jakarta.persistence.Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "NamBH")
    private int NamBH;

    @Column(name = "MoTa")
    private String MoTa;

    @Column(name = "SoLuongTon")
    private int SoLuongTon;

    @Column(name = "GiaNhap")
    private Double GiaNhap;

    @Column(name = "GiaBan")
    private Double GiaBan;


    public void loadFromVM(ChiTietSPVM ct){
        this.setNamBH(ct.getNamBH());
        this.setSoLuongTon(ct.getSoLuongTon());
        this.setMoTa(ct.getMoTa());
        this.setGiaNhap(ct.getGiaNhap());
        this.setGiaBan(ct.getGiaBan());


    }
}
