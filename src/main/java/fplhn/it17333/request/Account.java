package fplhn.it17333.request;


import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String email;
    private String pass;
    private boolean remember;

    @Value("${aname}")
    private String avalue;
}
