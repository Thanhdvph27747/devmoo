package fplhn.it17333.Repository;

import fplhn.it17333.Entity.NhanVienEntity;
import fplhn.it17333.viewsModel.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NhanVienRepo extends JpaRepository<NhanVienEntity, UUID> {
}
