package com.crudapp.customercrud.customer.services;

import com.crudapp.customercrud.customer.models.Customer;
import com.crudapp.customercrud.customer.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //CREATE
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    //READ
    public List<Customer> getCustomerList() {
        return customerRepository.findAll();
    }

    //READ
    public Optional<Customer> getCustomer(Long id) {
        return customerRepository.findById(id);
    }

    // DELETE
    public void deleteCustomerById(Long id) {
        customerRepository.deleteById(id);
    }

    //UPADTE
    public void updateCustomerById(Customer customer, Long id) {
        Customer customerDB = customerRepository.findById(id).get();

        if (Objects.nonNull(customer.getFirstName())
                && !"".equalsIgnoreCase(
                customer.getFirstName())) {
            customerDB.setFirstName(
                    customer.getFirstName());
        }
        if (Objects.nonNull(customer.getLastName())
                && !"".equalsIgnoreCase(
                customer.getLastName())) {
            customerDB.setLastName(
                    customer.getLastName());
        }
        if (Objects.nonNull(customer.getVatID())
                && !"".equalsIgnoreCase(
                customer.getVatID())) {
            customerDB.setVatID(
                    customer.getVatID());
        }
        if (Objects.nonNull(customer.getHouseNumber())
                && !"".equalsIgnoreCase(
                customer.getHouseNumber())) {
            customerDB.setHouseNumber(
                    customer.getHouseNumber());
        }
        if (Objects.nonNull(customer.getCity())
                && !"".equalsIgnoreCase(
                customer.getCity())) {
            customerDB.setCity(
                    customer.getCity());
        }
        if (Objects.nonNull(customer.getCountry())
                && !"".equalsIgnoreCase(
                customer.getCountry())) {
            customerDB.setCountry(
                    customer.getCountry());
        }
        if (Objects.nonNull(customer.getPostalCode())
                && !"".equalsIgnoreCase(
                customer.getPostalCode())) {
            customerDB.setPostalCode(
                    customer.getPostalCode());
        }
        if (Objects.nonNull(customer.getStreet())
                && !"".equalsIgnoreCase(
                customer.getStreet())) {
            customerDB.setStreet(
                    customer.getStreet());
        }
        customerRepository.save(customerDB);
    }

}
