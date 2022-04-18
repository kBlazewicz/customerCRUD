package com.crudapp.customercrud;

import com.crudapp.customercrud.address.models.Address;
import com.crudapp.customercrud.address.repositories.AddressRepository;
import com.crudapp.customercrud.customer.controllers.CustomerRepository;
import com.crudapp.customercrud.customer.models.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AddressRepository addressRepository, CustomerRepository customerRepository) {
        return args -> {
            Address address1 = new Address("22/3a", "Sesame street", "Cracow", "Poland", "22-400");
            log.info("Preloading " + addressRepository.save(address1));

            Customer customer1 = new Customer("Kamil", "Blazewicz", "12345", address1);
            address1.addCustomer(customer1);
            log.info("Preloading " + customerRepository.save(customer1));

            List<Address> addressList = addressRepository.findAll();
            System.out.println(addressList);
        };
    }
}
