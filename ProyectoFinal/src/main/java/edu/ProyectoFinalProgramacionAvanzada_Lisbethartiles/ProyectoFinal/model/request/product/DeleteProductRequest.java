package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.product.DeleteProductCommand;
import lombok.*;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class DeleteProductRequest {

    private long id;

    public DeleteProductCommand toCommand() {
        return DeleteProductCommand.builder()
                .id(id)
                .build();
    }
}
