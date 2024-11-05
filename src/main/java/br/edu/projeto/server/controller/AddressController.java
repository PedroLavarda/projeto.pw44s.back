package br.edu.projeto.server.controller;

import br.edu.projeto.server.dto.AddressDTO;
import br.edu.projeto.server.model.Address;
import br.edu.projeto.server.service.IAddressService;
import br.edu.projeto.server.service.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("addressess")
public class AddressController extends CrudController<Address, AddressDTO, Long> {
    private final IAddressService addressService;
    private final ModelMapper modelMapper;

    public AddressController(IAddressService addressService,
                           ModelMapper modelMapper) {
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
}
