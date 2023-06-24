package fplhn.it17333.Entity;

import fplhn.it17333.viewsModel.NhanVien;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name = "NhanVien")
@Entity(name = "NhanVien")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class NhanVienEntity {
    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;

    @Column(name = "Ma")
    private String Ma;

    @Column(name = "Ten")
    private String Ten;

    @NotBlank(message = "*Không được để trống!")
    @Column(name = "Ho")
    private String Ho;

    @Column(name = "GioiTinh")
    @NotBlank(message = "*Không được để trống!")
    private String GioiTinh;

    @Column(name = "NgaySinh")
    @NotBlank(message = "*Không được để trống!")
    private String NgaySinh;

    @Column(name = "DiaChi")
    @NotBlank(message = "*Không được để trống!")
    private String DiaChi;

    @Column(name = "Sdt")
    @NotBlank(message = "*Không được để trống!")
    private String Sdt;

    @Column(name = "MatKhau")
    @NotBlank(message = "*Không được để trống!")
    private String MatKhau;

    public void loadFromVm(NhanVien vm){
        this.setMa(vm.getMa());
        this.setTen(vm.getTen());
        this.setHo(vm.getHo());
        this.setGioiTinh(vm.getGioiTinh());
        this.setNgaySinh(vm.getNgaySinh());
        this.setSdt(vm.getSdt());
        this.setDiaChi(vm.getDiaChi());
        this.setMatKhau(vm.getMatKhau());

    }

    @ManyToOne
    @JoinColumn(name = "idCH")
    private CuaHangEntity CuaHang;


}
