package ro.siit.carrental.domain;

/**
 * Created by Ovidiu Petridean
 */

//todo: replace this with your own implementation
public class Car {

    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
}
