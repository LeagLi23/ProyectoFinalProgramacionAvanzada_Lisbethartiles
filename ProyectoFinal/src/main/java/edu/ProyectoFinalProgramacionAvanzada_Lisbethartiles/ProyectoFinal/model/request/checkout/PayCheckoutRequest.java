package   edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.checkout;

import   edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout.PayCheckoutCommand;
import lombok.*;

import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PayCheckoutRequest {

    private UUID id;

    public PayCheckoutCommand toCommand() {
        return PayCheckoutCommand.builder()
                .id(id)
                .build();
    }
}
