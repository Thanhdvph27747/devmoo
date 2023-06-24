package fplhn.it17333.viewsModel;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
public class SanPhamBanVM {
    private String Email;
    private String DiaChi;
    private int soLuong;
    private String SoTien;
    private String TenSP;

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to,String subject,String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        javaMailSender.send(message);
    }
}
