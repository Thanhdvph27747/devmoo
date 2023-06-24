package fplhn.it17333.Repository;

import fplhn.it17333.Entity.ChiTietSP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ChiTietSPRepo extends JpaRepository<ChiTietSP, UUID> {
}
