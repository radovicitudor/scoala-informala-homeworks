package ro.sci.carrental.readerCar;

/**
 * Created by tudor.radovici on 14.07.2017.
 */
public interface Convertor<T> {
    T convert(String convertedString) throws InvalidEntityException;
}
