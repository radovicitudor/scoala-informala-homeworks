package ro.sci.carrental.domain.customer;

/**
 * Created by tudorradovici on 29/05/17.
 */
public class CustomerAddress {
    private String streetAddress;
    private String city;
    private String county;
    private String country;
    private int postalCode;

    /**
     * Default Constructor
     */
    public CustomerAddress() {
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {this.postalCode = postalCode;}
}