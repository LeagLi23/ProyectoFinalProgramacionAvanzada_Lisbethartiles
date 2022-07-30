package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.UpdateAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.exceptions.AddressNoFoundException;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
@CommandEvent(command = UpdateAddressCommand.class)
@Slf4j
public class UpdateAddressCommandHandler implements CommandHandler<UpdateAddressResponse, UpdateAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public UpdateAddressResponse handle(UpdateAddressCommand updateAddressCommand) {
        Address address = addressRepository.findById(updateAddressCommand.getId()).orElseThrow(() -> new AddressNoFoundException(updateAddressCommand.getId()));
        address.setName(updateAddressCommand.getName());
        address.setDescription(updateAddressCommand.getDescription());
        addressRepository.save(address);
        log.info("Address {} updated", updateAddressCommand.getId());
        return UpdateAddressResponse.builder().address(address.toDTO()).build();
    }
}
