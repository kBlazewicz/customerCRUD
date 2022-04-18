package com.crudapp.customercrud.customer.models;

import com.crudapp.customercrud.address.models.Address;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique=true)
    private String vatID;
    private LocalDate creationDate;

    @ManyToOne
    private Address address;

    public Customer(String firstName, String lastName, String vatID, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vatID = vatID;
        this.creationDate = LocalDate.now();
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return id != null && Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
