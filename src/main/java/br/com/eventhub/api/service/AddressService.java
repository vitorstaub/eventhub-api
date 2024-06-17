package br.com.eventhub.api.service;

import br.com.eventhub.api.domain.address.Address;
import br.com.eventhub.api.domain.event.Event;
import br.com.eventhub.api.domain.event.EventRequestDTO;
import br.com.eventhub.api.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address createAddress(EventRequestDTO data, Event event) {
        Address address = new Address();
        address.setCity(data.city());
        address.setUf(data.uf());
        address.setEvent(event);

        return addressRepository.save(address);
    }
}
