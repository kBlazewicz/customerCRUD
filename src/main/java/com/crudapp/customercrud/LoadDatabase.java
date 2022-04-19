package com.crudapp.customercrud;

import com.crudapp.customercrud.customer.models.Customer;
import com.crudapp.customercrud.customer.repositories.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(CustomerRepository customerRepository) {
        return args -> {

            Customer customer1 = new Customer("Kamil", "Blazewicz", "12345", "22/3a", "Sesame street", "Cracow", "Poland", "22-400");
            log.info("Preloading " + customerRepository.save(customer1));

        };
    }
}
