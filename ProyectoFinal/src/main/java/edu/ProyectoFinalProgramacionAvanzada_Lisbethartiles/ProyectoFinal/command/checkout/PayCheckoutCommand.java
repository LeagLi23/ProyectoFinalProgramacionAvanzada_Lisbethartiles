package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.checkout;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Checkout;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Order;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.checkout.PayCheckoutResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.Command;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.saga.model.SagaPayLoadKey;
import lombok.*;

import java.util.UUID;

 
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PayCheckoutCommand extends Command<PayCheckoutResponse> {

    public static final SagaPayLoadKey<UUID> ID = new SagaPayLoadKey<>("id", UUID.class);
    public static final SagaPayLoadKey<PayCheckoutCommand> COMMAND = new SagaPayLoadKey<>("command", PayCheckoutCommand.class);
    public static final SagaPayLoadKey<Checkout> CHECKOUT = new SagaPayLoadKey<>("checkout", Checkout.class);
    public static final SagaPayLoadKey<Order> ORDER = new SagaPayLoadKey<>("order", Order.class);
    public static final SagaPayLoadKey<String> PAYMENT_INTENT = new SagaPayLoadKey<>("payment_intent", String.class);

    private UUID id;
}
