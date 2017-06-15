package ro.sci.carrental.domain;
import ro.sci.carrental.util.PaymentMethod;
/**
 * Created by tudor.radovici on 15.06.2017.
 */
public class Transaction {
    private Customer firstName;
    private Customer lastName;
    private CustomerAddress customerAddress;
    private int transactionId;
    private PaymentMethod paymentMethod;
    private Customer customerId;

    public Transaction(int transactionId, Customer customerId, Customer firstName, Customer lastName, CustomerAddress customerAddress){
        this.transactionId=transactionId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.paymentMethod = paymentMethod;
        this.customerId=customerId;
        this.customerAddress=customerAddress;

    }
}
