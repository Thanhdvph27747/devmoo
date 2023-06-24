package fplhn.it17333.SPBan;

import fplhn.it17333.viewsModel.SanPhamBanVM;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import java.util.UUID;

@Entity(name = "NguoiMuaHang")
@Table(name = "NguoiMuaHang")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class NguoiMuaHang {


    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Email")
    @Email(message = "*Vui lòng nhập đúng định dạng!")
    @NotBlank(message = "*Vui lòng không để trống!")
    private String Email;

    @NotBlank(message = "*Vui lòng không để trống!")
    @Column(name = "DiaChi")
    private String DiaChi;

    @Column(name = "TenSP")
    private String TenSP;

    @Pattern(regexp = "\\d{10}", message = "Số điện thoại không hợp lệ!")
    @Column(name = "Sdt")
    private String Sdt;

    @Column(name = "SoLuong")
    private int SoLuong;

    @Column(name = "SoTien")
    private String SoTien;

    @Column(name = "ThoiGianMua")
    private String ThoiGianMua;



    public void loadFormSPBanVM(SanPhamBanVM s){
        this.setTenSP(s.getTenSP());
        this.setSoLuong(s.getSoLuong());
        this.setSoTien(s.getSoTien());

    }



}
