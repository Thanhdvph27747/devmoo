package fplhn.it17333.viewsModel;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KhachHang {
    @NotBlank(message = "*Không được để trống!")
    private String Ma;

    @NotBlank(message = "*Không được để trống!")
    private String Ten;

    @NotBlank(message = "*Không được để trống!")
    private String Ho;

    //@NotBlank(message = "*Không được để trống!")
    private Date NgaySinh;

    @NotBlank(message = "*Không được để trống!")
    private String Sdt;

    @NotBlank(message = "*Không được để trống!")
    private String DiaChi;
    //private String ThanhPho;
    @NotBlank(message = "*Không được để trống!")
    private String QuocGia;

    public void loadFromEntity(fplhn.it17333.Entity.KhachHang kh ){
        this.setMa(kh.getMa());
        this.setTen(kh.getTen());
        this.setHo(kh.getHo());
        this.setNgaySinh(kh.getNgaySinh());
        this.setSdt(kh.getSdt());
        this.setDiaChi(kh.getDiaChi());
        this.setQuocGia(kh.getQuocGia());

    }


}
