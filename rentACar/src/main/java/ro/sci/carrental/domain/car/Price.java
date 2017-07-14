package ro.sci.carrental.domain.car;

/**
 * Created by tudor.radovici on 11.07.2017.
 */
public class Price {
    private double value;
    private String formattedValue;

    public Price() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }
}
