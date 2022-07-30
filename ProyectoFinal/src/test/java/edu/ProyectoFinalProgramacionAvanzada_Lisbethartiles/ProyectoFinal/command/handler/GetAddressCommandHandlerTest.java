package edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler;

import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.address.GetAddressCommand;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.command.handler.address.GetAddressCommandHandler;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.domain.Address;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.dto.AddressDTO;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.model.response.adress.GetAddressResponse;
import edu.ProyectoFinalProgramacionAvanzada_Lisbethartiles.ProyectoFinal.repositories.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

 
@SpringBootTest
class GetAddressCommandHandlerTest {

    @Mock
    private AddressRepository addressRepository;

    @BeforeEach
    void setup() {
    }

    @Test
    void getAddressTest() {
        Address addressMock = Mockito.spy(Address.class);
        addressMock.setId(1L);
        addressMock.setName("Hello");
        addressMock.setDescription("");
        GetAddressCommand getAddressCommand = GetAddressCommand.builder().id(addressMock.getId()).build();
        Mockito.when(addressRepository.findById(ArgumentMatchers.eq(1L))).thenReturn(Optional.of(addressMock));
        GetAddressCommandHandler getAddressCommandHandler = new GetAddressCommandHandler(addressRepository);
        GetAddressResponse getAddressResponse = getAddressCommandHandler.handle(getAddressCommand);
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