package fplhn.it17333.Repository;

import fplhn.it17333.SPBan.NguoiMuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface NguoiMuaHangRepo extends JpaRepository<NguoiMuaHang, UUID> {
}
