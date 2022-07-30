package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.CreateAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

 
@Component
@RequiredArgsConstructor
@CommandEvent(command = CreateAddressCommand.class)
@Slf4j
public class CreateAddressCommandHandler implements CommandHandler<CreateAddressResponse, CreateAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public CreateAddressResponse handle(CreateAddressCommand createAddressCommand) {
        Address address = addressRepository.save(createAddressCommand.toAddress());
        log.info("Address {} created", address.getId());
        return CreateAddressResponse.builder()
                .address(address.toDTO())
                .build();
    }
}
