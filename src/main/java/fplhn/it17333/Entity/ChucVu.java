package fplhn.it17333.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import fplhn.it17333.viewsModel.ChucVuVM;
import java.util.UUID;

@Table(name = "ChucVu")
@Entity(name = "ChucVu")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ChucVu {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    public void loadFromVM(ChucVuVM vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }
}
