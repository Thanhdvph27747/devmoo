package fplhn.it17333.Entity;



import fplhn.it17333.viewsModel.CuaHang;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CuaHang")
@Entity(name = "CuaHang")
public class CuaHangEntity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "ThanhPho")
    private String ThanhPho;

    @Column(name = "QuocGia")
    private String QuocGia;

    public void loadFromVM(CuaHang vm)
    {
        this.setMa( vm.getMa() );
        this.setTen( vm.getTen() );
        this.setThanhPho( vm.getThanhPho() );
        this.setQuocGia( vm.getQuocGia() );
        this.setDiaChi( vm.getDiaChi() );
    }


}
