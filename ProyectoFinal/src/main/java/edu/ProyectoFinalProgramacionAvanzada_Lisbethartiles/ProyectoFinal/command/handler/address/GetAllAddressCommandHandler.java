package  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address;

import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.GetAllAddressCommand;
import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandEvent;
import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.patterns.command.CommandHandler;
import  edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAllAddressCommand.class)
@Slf4j
public class GetAllAddressCommandHandler implements CommandHandler<GetAddressResponse, GetAllAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public GetAddressResponse handle(GetAllAddressCommand getAllAddressCommand) {
        log.debug("Get Addresses {}", getAllAddressCommand.toString());
        List<AddressDTO> addressDTOS = addressRepository.findAllByNameContainingIgnoreCase(
                        getAllAddressCommand.getName(),
                        PageRequest.of(getAllAddressCommand.getPage(), getAllAddressCommand.getPageSize()))
                .stream()
                .map(Address::toDTO)
                .collect(Collectors.toList());
        return GetAddressResponse.builder()
                .addresses(addressDTOS)
                .build();
    }
}