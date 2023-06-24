package fplhn.it17333.Entity;

import fplhn.it17333.viewsModel.SanPhamVM;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "SanPham")
@Entity(name = "SanPham")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SanPham {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    public void loadFromVM(SanPhamVM vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }

}
