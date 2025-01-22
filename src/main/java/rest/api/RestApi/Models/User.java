package rest.api.RestApi.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_users")
    private Long id;

    @Column(unique = true)
    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

}
