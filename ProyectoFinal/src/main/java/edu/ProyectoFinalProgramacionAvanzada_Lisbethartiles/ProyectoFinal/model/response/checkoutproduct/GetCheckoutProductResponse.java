package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkoutproduct;


import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.CheckoutProductDTO;
import lombok.*;

import java.util.List;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetCheckoutProductResponse {

    private List<CheckoutProductDTO> checkoutProducts;
}
