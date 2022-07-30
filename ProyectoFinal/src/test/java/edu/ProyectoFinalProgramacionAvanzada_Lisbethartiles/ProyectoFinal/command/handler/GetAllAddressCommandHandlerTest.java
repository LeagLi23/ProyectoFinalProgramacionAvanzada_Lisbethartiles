package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.GetAllAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address.GetAllAddressCommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 
@SpringBootTest
class GetAllAddressCommandHandlerTest {

    @Mock
    private AddressRepository addressRepository;

    @BeforeEach
    void setup() {
    }

    @Test
    void getAllAddressTest() {
        Address addressMock = Mockito.spy(Address.class);
        addressMock.setId("");
        addressMock.setName("Hello");
        addressMock.setDescription("");
        GetAllAddressCommand getAllAddressCommand = GetAllAddressCommand.builder()
                .name("")
                .pageSize(10)
                .page(0)
                .build();
        Mockito.when(addressRepository.findAllByNameContainingIgnoreCase(ArgumentMatchers.anyString(), ArgumentMatchers.any())).thenReturn(List.of(addressMock));
        GetAllAddressCommandHandler getAllAddressCommandHandler = new GetAllAddressCommandHandler(addressRepository);
        GetAddressResponse getAddressResponse = getAllAddressCommandHandler.handle(getAllAddressCommand);
        assertNotNull(getAddressResponse);
        List<AddressDTO> addresses = getAddressResponse.getAddresses();
        assertNotNull(addresses);
        assertFalse(addresses.isEmpty());
        assertEquals(1, addresses.size());
        AddressDTO address = addresses.get(0);
        assertEquals(addressMock.getId(), address.getId());
        assertEquals(addressMock.getName(), address.getName());
        assertEquals(addressMock.getDescription(), address.getDescription());
    }

}