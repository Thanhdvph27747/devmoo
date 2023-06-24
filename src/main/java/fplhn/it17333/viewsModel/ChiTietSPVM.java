package fplhn.it17333.viewsModel;

import fplhn.it17333.Entity.ChiTietSP;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietSPVM {
   // @NotBlank(message = "*Không được để trống!")
    private int NamBH;
    @NotBlank(message = "*Không được để trống!")
    private String MoTa;
    //@NotBlank(message = "*Không được để trống!")
    private int SoLuongTon;
    //@NotBlank(message = "*Không được để trống!")
    private Double GiaNhap;
    //@NotBlank(message = "*Không được để trống!")
    private Double GiaBan;

    public void loadFromEntity(ChiTietSP ct){
        this.setNamBH(ct.getNamBH());
        this.setSoLuongTon(ct.getSoLuongTon());
        this.setMoTa(ct.getMoTa());
        this.setGiaNhap(ct.getGiaNhap());
        this.setGiaBan(ct.getGiaBan());


    }

}
