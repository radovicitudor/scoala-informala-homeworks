package ro.sci.carrental.repository;

import java.util.List;
import  ro.sci.carrental.domain.Transaction;

/**
 * Created by tudor.radovici on 15.06.2017.
 */
public interface  TransactionRepository {

    /**
     * Return a List of All transactions
     * @return
     */
    List<Transaction> getAll();

    /**
     * Adds a new transaction to the Repo
     * @param transaction
     */
    void add(Transaction transaction);

    /**
     * Updates an existing Transaction
     * @param transaction
     */
    void update(Transaction transaction);
}
