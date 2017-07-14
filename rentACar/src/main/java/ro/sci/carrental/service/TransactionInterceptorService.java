package ro.sci.carrental.service;
import ro.sci.carrental.calendar.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor.radovici on 12.07.2017.
 */
public interface TransactionInterceptorService {

    List<Transaction> findTransactionById(int id);

    List<Transaction> findAll(ArrayList<Transaction> transaction);
}
