package ro.sci.carrental.repository;

import ro.sci.carrental.Calendar.Transaction;

import java.util.List;

/**
 * Created by tudor.radovici on 11.07.2017.
 */
public interface TransactionRepository {


    List<Transaction> getAll();

    List<Transaction> getTransactionById(int id);

    void add(Transaction transaction);

    void delete (Transaction transaction);

    void update(Transaction transaction);
}
