package ro.sci.carrental.domain.customer;

import java.text.SimpleDateFormat;


/**
 * Created by tudorradovici on 29/05/17.
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;

    private SimpleDateFormat dateOfBirth;
    private SimpleDateFormat dateOfDriversLicense;

    private CustomerAddress customerAddress;
    private PaymentMethod paymentMethod;

    /**
     *
     */
    public Customer() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.dateOfDriversLicense = dateOfDriversLicense;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.customerAddress = customerAddress;
        this.paymentMethod = paymentMethod;
    }
    public Customer(int id, String firstName, String lastName, String email, CustomerAddress customerAddress, PaymentMethod paymentMethod){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.customerAddress=customerAddress;
        this.paymentMethod=paymentMethod;
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

    public CustomerAddress getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(CustomerAddress customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public SimpleDateFormat getDateOfBirth(){return dateOfBirth;}

    public SimpleDateFormat getDateOfDriversLicense(){return dateOfDriversLicense;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}