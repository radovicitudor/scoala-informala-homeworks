package ro.sci.carrental.repository;

import ro.sci.carrental.domain.Transaction;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by tudor.radovici on 15.06.2017.
 */
public class TransactionRepositoryImpl implements TransactionRepository {

    private List<Transaction> transactions= new ArrayList<>();

    public List<Transaction> getAll() {
        return transactions;
    }

    public List<Transaction> getTransactionById() {return null;}

    public void add(Transaction transaction) {transactions.add (transaction);}

    public void update(Transaction transaction) {transactions.set (transactions.indexOf(transaction), transaction);}
}
