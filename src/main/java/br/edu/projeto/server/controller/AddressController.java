package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.AddressDTO;
import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.service.IAddressService;
import br.edu.projeto.server.service.ICrudService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("addresses")
public class AddressController extends CrudController<Address, AddressDTO, Long> {
    private final IAddressService addressService;
    private final ModelMapper modelMapper;

    public AddressController(IAddressService addressService, ModelMapper modelMapper) {
        super(Address.class, AddressDTO.class);
        this.addressService = addressService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<Address, Long> getService() {
        return this.addressService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }

    private AddressDTO convertToDto(Address entity) {
        return getModelMapper().map(entity, AddressDTO.class);
    }

    @GetMapping("/ofuser/{iduser}")
    public ResponseEntity<List<AddressDTO>> getAddressesByUser(@PathVariable Long iduser) {
        return ResponseEntity.ok(
                addressService.getAddressesByUser(iduser).stream().map(
                        this::convertToDto).collect(Collectors.toList()
                )
        );
    }
}
