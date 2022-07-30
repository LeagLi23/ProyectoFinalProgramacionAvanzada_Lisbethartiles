package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.services;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.GetAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.GetAllAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address.CreateAddressRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address.DeleteAddressRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.request.address.UpdateAddressRequest;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class AddressService {

    private final CommandBus commandBus;

    public GetAddressResponse getAll() {
        return commandBus.sendCommand(GetAllAddressCommand.builder().build());
    }

    public GetAddressResponse get(Long id) {
        return commandBus.sendCommand(GetAddressCommand.builder().id(id).build());
    }

    public CreateAddressResponse create(CreateAddressRequest createAddressRequest) {
        return commandBus.sendCommand(createAddressRequest.toCommand());
    }

    public UpdateAddressResponse update(UpdateAddressRequest updateAddressRequest) {
        return commandBus.sendCommand(updateAddressRequest.toCommand());
    }

    public DeleteAddressResponse delete (DeleteAddressRequest deleteAddressRequest) {
        return commandBus.sendCommand(deleteAddressRequest.toCommand());
    }

}
