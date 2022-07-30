package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

 
@AllArgsConstructor
@Builder
@Getter
@Setter
public class CreateProductResponse {

    private ProductDTO product;
}
