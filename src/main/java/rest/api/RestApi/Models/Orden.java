package rest.api.RestApi.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "orden")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Orden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_orden")
    private Long idOrden;

    private String number;

    private Date fechaCreacion;

    private Date fechaEntrega;

    private double total;

}
