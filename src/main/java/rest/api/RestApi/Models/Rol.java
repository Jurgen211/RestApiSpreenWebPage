package rest.api.RestApi.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "rols")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rol {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long id;

    @Column(unique = true)
    private String description;


}
