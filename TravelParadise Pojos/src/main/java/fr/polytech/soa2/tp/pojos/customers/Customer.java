package fr.polytech.soa2.tp.pojos.customers;

import java.util.UUID;

/**
 * Created by clement0210 on 15-01-26.
 */
public class Customer {

    private String lastname, firstname, address, zipcode, city, mail;
    private String id;

    public Customer(String lastname, String firstname, String mail, String address, String zipcode, String city) {
        this.lastname = lastname;
        this.firstname=firstname;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.mail=mail;
        this.id= UUID.randomUUID().toString();
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMail(){ return  mail;}

    public String getAddress() {
        return address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Customer){
            return firstname.equals(((Customer)o).getFirstname()) && lastname.equals(((Customer)o).getLastname());
        }
        return false;
    }
}
