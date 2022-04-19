# customerCRUD
## Spring boot CRUD API for customer management using H2 database 

#### Application contains following endpoints:

+ `GET http://localhost:8080/customers` - returns list of customers in database <br>
  **Example**:<br>
[
    {<br>
        "id": 1,<br>
        "firstName": "Kamil",<br>
        "lastName": "Blazewicz",<br>
        "vatID": "12345",<br>
        "creationDate": "2022-04-19",<br>
        "houseNumber": "22/3a",<br>
        "street": "Sesame street",<br>
        "city": "Cracow",<br>
        "country": "Poland",<br>
        "postalCode": "22-400"<br>
    },<br>
    {<br>
        "id": 2,<br>
        "firstName": "Magda",<br>
        "lastName": "Magdalewicz",<br>
        "vatID": "3214",<br>
        "creationDate": "2022-04-19",<br>
        "houseNumber": "2/3a",<br>
        "street": "Okopowa",<br>
        "city": "Warsaw",<br>
        "country": "Poland",<br>
        "postalCode": "232-400"<br>
    }
]
<br><br>
+ `GET http://localhost:8080/customers/{id}` - returns customer with given id. If customer does not exist, returns null <br>
  **Example**: <br>
{<br>
    "id": 1,<br>
    "firstName": "Kamil",<br>
    "lastName": "Blazewicz",<br>
    "vatID": "12345",<br>
    "creationDate": "2022-04-19",<br>
    "houseNumber": "22/3a",<br>
    "street": "Sesame street",<br>
    "city": "Cracow",<br>
    "country": "Poland",<br>
    "postalCode": "22-400"<br>
}
<br><br>
+ `POST http://localhost:8080/customers` - creates customer with given data
  **Example body of POST method**: <br>
{<br>
    "id": 2,<br>
    "firstName": "Magda",<br>
    "lastName": "Magdalewicz",<br>
    "vatID": "3214",<br>
    "creationDate": "2022-04-19",<br>
    "houseNumber": "2/3a",<br>
    "street": "Okopowa",<br>
    "city": "Warsaw",<br>
    "country": "Poland",<br>
    "postalCode": "232-400"<br>
}
<br><br>
+ `PUT http://localhost:8080/customers/{id}` - update customer with given id, and given data, returns "Updated Successfully" if updated
  **Example body of PUT method**: <br>
    {<br>
        "firstName": "PIOTR",<br>
        "lastName": "Blazewicz",<br>
        "vatID": "12345",<br>
        "houseNumber": "22/3a",<br>
        "street": "Sesame street",<br>
        "city": "Wroclaw",<br>
        "country": "Poland",<br>
        "postalCode": "22-400"<br>
    }
<br><br>
+ `DELETE http://localhost:8080/customers/{id}` - deletes customer with given id, returns "Deleted Successfully" if updated
<br><br>


#### To run the application with maven installed type in your terminal:
  `git clone https://github.com/kBlazewicz/customerCRUD` <br>
  `cd customerCRUD`<br>
  `mvn spring-boot:run`
<br>
