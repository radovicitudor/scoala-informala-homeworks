package ro.sci.carrental.domain.car;

/**
 * Created by Radovici Tudor
 */

    public class Car {
        private String make;
        private String model;
        private float size;
        private String color;
        private int seats;
        private int doors;
        private int power;
        private int minAgeRequired;
        private int maxMilagePerRent;
        private boolean milageLimit;
        private boolean ac = false;
        private boolean gps = false;
        private Gearbox gearbox;
        private FuelType fuelType;
        private VehicleCategory vehicleCategory;
        private boolean reserved;
        private Price rentPrice;

        /**
         * Constructorul default
         */
        public Car() {}

    public String getMake(){return make;};

    public void setMake(String make){this.make=make;}

    public String getModel(){return model;};

    public void setModel(String model){this.model=model;}

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int  getPower(int power){return power;}

    public void setPower(int power){this.power=power;}

    public int getMinAgeRequired(int minAgeRequired){return minAgeRequired;}

    public void setMinAgeRequired(int minAgeRequired){this.minAgeRequired=minAgeRequired;}

    public int getMaxMilagePerRent(int maxMilagePerRent){return maxMilagePerRent;}

    public void setMaxMilagePerRent(int maxMilagePerRent){this.maxMilagePerRent=maxMilagePerRent;}


    public void setMilageLimit(){this.milageLimit = milageLimit;}

    public boolean hasAc(boolean ac){return  ac;}

    public void setAc(boolean ac){this.ac= ac;}

    public boolean hasGps(boolean gps){return gps;}

    public  void setGps(boolean gps){this.gps=gps;}

    public Gearbox getGearbox(){return gearbox;}

    public void setGearbox(Gearbox gearbox){this.gearbox=gearbox;}

    public FuelType getFuelType(FuelType fuelType){return  fuelType;}

    public void setFuelType(FuelType fuelType){this.fuelType=fuelType;}

    public VehicleCategory getVehicleCategory(VehicleCategory vehicleCategory){return  vehicleCategory;}

    public void setVehicleCategory(VehicleCategory vehicleCategory){this.vehicleCategory=vehicleCategory;}

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Price getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Price rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                ", seats=" + seats + '\'' +
                ", doors=" + doors + '\'' +
                ", ac=" + ac + '\'' +
                ", gps=" + gps + '\'' +
                ", gearbox=" + gearbox + '\'' +
                ", power=" + power + '\'' +
                ", fuelType=" + fuelType + '\'' +
                ", vehicleCategory=" + vehicleCategory +
                '}';
    }

}
