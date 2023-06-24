package fplhn.it17333.Repository;

import fplhn.it17333.Entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface KhachHangRepo extends JpaRepository<KhachHang, UUID> {
}
