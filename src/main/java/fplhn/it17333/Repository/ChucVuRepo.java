package fplhn.it17333.Repository;

import fplhn.it17333.Entity.ChiTietSP;
import fplhn.it17333.Entity.ChucVu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChucVuRepo extends JpaRepository<ChucVu, UUID> {
}
