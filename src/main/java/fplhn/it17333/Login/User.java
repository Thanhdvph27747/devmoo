package fplhn.it17333.Login;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class User {
    @Email(message = "*Không đúng định dạng email!")
    @NotBlank(message = "*Vui lòng không bỏ trống!")
    private String Email;

    @NotBlank(message = "*Vui lòng không bỏ trống!")
    private String Pass;
}
