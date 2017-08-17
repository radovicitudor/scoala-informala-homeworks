package ro.sci.carrental.repository;

import ro.sci.carrental.domain.car.Car;

import java.util.List;

public  interface Repository<T> {

    void add(T t);

    void delete(T t);

    void update(T t, T v);

    List<T> getAll();

    void addAll();


}
