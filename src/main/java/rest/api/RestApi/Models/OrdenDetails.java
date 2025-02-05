package rest.api.RestApi.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orden_details")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrdenDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_ordendetails")
    private Long id;

    private String nombre;

    private double precio;

    private double cantidad;

    private double total;

    @OneToOne
    private Orden orden;

    @OneToOne
    private Product product;


}
