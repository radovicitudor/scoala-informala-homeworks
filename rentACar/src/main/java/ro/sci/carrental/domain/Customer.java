package ro.sci.carrental.domain;

import ro.sci.carrental.util.PaymentMethod;
import sun.java2d.pipe.SpanShapeRenderer;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by tudorradovici on 29/05/17.
 */
public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;


    //dates  NOK

    private SimpleDateFormat dateOfBirth;
    private SimpleDateFormat dateOfDriversLicense;

    private CustomerAddress customerAddress;
    private PaymentMethod paymentMethod;

    /**
     * Constructor for all fields
     *  @param customerId              id
     * @param firstName       First Name
     * @param lastName        Last Name
     * @param telephone       Telephone No.
     * @param email           email address
     * @param customerAddress Customer address
     * @param paymentMethod   Payment method
     */
    public Customer(int customerId, String firstName, String lastName, String telephone, SimpleDateFormat dateOfDriversLicense, SimpleDateFormat dateOfBirth, String email, CustomerAddress customerAddress, PaymentMethod paymentMethod) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.dateOfDriversLicense = dateOfDriversLicense;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.customerAddress = customerAddress;
        this.paymentMethod = paymentMethod;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName
     */
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int id) {
        this.customerId = customerId;
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