package ro.sci.carrental.service;

import ro.sci.carrental.domain.customer.Customer;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by tudor.radovici on 31.05.2017.
 */
public interface CustomerService<T> {

    void add(T customer);

    void delete(T customer);

    void update(T newCustomer, T oldCustomer);

    void addAll();





}
