package com.crudapp.customercrud.customer.controllers;

import com.crudapp.customercrud.customer.models.Customer;
import com.crudapp.customercrud.customer.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/customers")
    public Customer saveDepartment(
            @Valid @RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomerList() {
        return customerService.getCustomerList();
    }

    @GetMapping("/customers/{id}")
    public Optional<Customer> getCustomerList(@PathVariable("id") Long id) {
        return customerService.getCustomer(id);
    }

    @PutMapping("/customers/{id}")
    public String updateCustomer(@RequestBody Customer customer,
                                 @PathVariable("id") Long id) {
        customerService.updateCustomerById(customer, id);
        return "Updated Successfully";
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomerById(@PathVariable("id") Long id) {
        customerService.deleteCustomerById(id);
        return "Deleted Successfully";
    }
}
