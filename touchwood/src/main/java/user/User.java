package user;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
public class User {

    private Integer id;
    private String name;
    private Date birthDate;
}
