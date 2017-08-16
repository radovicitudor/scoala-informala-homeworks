package ro.sci.carrental.repository;

import java.util.List;

public  interface Repository<T> {

    void add(T t);

    void delete(T t);

    void update(T t);

    List<T> getAll();

    void addAll();
}
