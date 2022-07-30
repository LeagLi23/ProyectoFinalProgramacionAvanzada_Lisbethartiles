package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;


 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class UpdateProductResponse {

    private ProductDTO product;
}
