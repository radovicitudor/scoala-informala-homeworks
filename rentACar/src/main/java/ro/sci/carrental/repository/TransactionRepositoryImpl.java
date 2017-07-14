package ro.sci.carrental.repository;

import ro.sci.carrental.Calendar.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudor.radovici on 11.07.2017.
 */
public class TransactionRepositoryImpl implements  TransactionRepository{

    private List<Transaction> transactions = new ArrayList<> ();

    public List<Transaction> getAll() {
        return null;
    }

    public List<Transaction> getTransactionById(int id) {
        return null;
    }

    public void add(Transaction transaction) {

    }

    public void delete(Transaction transaction) {

    }

    public void update(Transaction transaction) {

    }
}
