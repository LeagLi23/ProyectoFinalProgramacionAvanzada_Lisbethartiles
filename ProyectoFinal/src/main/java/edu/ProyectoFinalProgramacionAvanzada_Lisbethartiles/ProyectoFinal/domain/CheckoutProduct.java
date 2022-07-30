package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import lombok.*;

import javax.persistence.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "checkouts_products")
public class CheckoutProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Product product;

    @Column
    private Long quantity;

    public CheckoutProductDTO toDTO() {
        return CheckoutProductDTO.builder()
                .id(id)
                .product(product.toDTO())
                .quantity(quantity)
                .build();
    }
}
