package fplhn.it17333.viewsModel;

import fplhn.it17333.Entity.ChucVu;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChucVuVM {
    @NotBlank(message = "*Không được bỏ trống!")
    private String Ma;
    @NotBlank(message = "*Không được bỏ trống!")
    private String Ten;

    public void loadFromEntity(ChucVu vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
    }
}
