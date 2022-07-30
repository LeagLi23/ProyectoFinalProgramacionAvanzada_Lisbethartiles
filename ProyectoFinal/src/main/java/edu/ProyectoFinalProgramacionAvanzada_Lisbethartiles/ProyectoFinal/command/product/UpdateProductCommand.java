package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import lombok.*;

import java.math.BigDecimal;

 
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UpdateProductCommand extends Command<UpdateProductResponse> {

    private Long id;
    private String name;
    private String description;
    private long availableQuantity;
    private BigDecimal price;

}