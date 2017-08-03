package ro.sci.carrental;

import ro.sci.carrental.util.CarDAO;
import ro.sci.carrental.util.CustomerDAO;

public class Main {

    public static void main(String[] args)  {
       DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.connect();

        CarDAO carDAO = new CarDAO();
        CustomerDAO customerDAO = new CustomerDAO();


    }
}
