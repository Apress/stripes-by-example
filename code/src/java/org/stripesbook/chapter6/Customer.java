package org.stripesbook.chapter6;

public class Customer {
    
    private String firstName;
    private String lastName;
    private Long customerId;
    private Address address;

    // <editor-fold desc="Getters and Setters...">
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // </editor-fold>
    
}
