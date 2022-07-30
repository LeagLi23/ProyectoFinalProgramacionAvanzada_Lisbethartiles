package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

import javax.persistence.*;


 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "payment_methods")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    /**
     * Patrón más integrado y adecuado en la lógica, cada objeto se hace responsable de sus conversiones
     *
     * @return Modelo DTO del paymentMethod
     */
    public PaymentMethodDTO toDTO() {
        return PaymentMethodDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }


}