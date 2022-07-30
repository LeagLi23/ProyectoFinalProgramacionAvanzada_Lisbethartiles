package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.product;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

import java.util.List;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter

public class GetProductResponse {


    private List<ProductDTO> products;


}
