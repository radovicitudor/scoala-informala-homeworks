package ro.sci.carrental.domain.customer;


/**
 * Created by tudorradovici on 29/05/17.
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String telephone;
    private String email;
    private String dateOfBirth;
    private String dateOfDriversLicense;
    private CustomerAddress customerAddress;
    private PaymentMethod paymentMethod;

    /**
     *
     */
    public Customer() {}

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

    public String getDateOfBirth(){return dateOfBirth;}

    public void setDateOfBirth(String dateOfBirth){this.dateOfBirth =dateOfBirth;}

    public String getDateOfDriversLicense(){return dateOfDriversLicense;}

    public void setDateOfDriversLicense (String dateOfDriversLicense){this.dateOfDriversLicense=dateOfDriversLicense;}

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

    public String toString(){
        return "Customer {" +
                ", id='"+ id +'\'' +
                ", firstName='"+ firstName +'\'' +
                ", lastName='"+ lastName +'\'' +
                ", customerAddress='"+ customerAddress +'\'' +
                ", telephone='"+ telephone +'\'' +
                ", dateOfBirth='"+ dateOfBirth +'\'' +
                ", dateOfDriverLicense='"+ dateOfDriversLicense +'\''+
                ", email='"+ email +'\'' +
                ", paymentMethod='"+ paymentMethod +'\'' +
                '}';


    }

}