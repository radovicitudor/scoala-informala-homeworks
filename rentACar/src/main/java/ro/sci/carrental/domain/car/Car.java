package ro.sci.carrental.domain.car;

/**
 * Created by Radovici Tudor
 */

    public class Car {
        public int id;
        private String make;
        private String model;
        private double size;
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

        public int getId(){return id;}

        public void setId(int id){this.id=id;}

        public String getMake(){return make;};

        public void setMake(String make){this.make=make;}

        public String getModel(){return model;};

        public void setModel(String model){this.model=model;}

        public double getSize() {
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

        public int  getPower(){return power;}

        public void setPower(int power){this.power=power;}

        public int getMinAgeRequired(){return minAgeRequired;}

        public void setMinAgeRequired(int minAgeRequired){this.minAgeRequired=minAgeRequired;}

        public int getMaxMilagePerRent(){return maxMilagePerRent;}

        public void setMaxMilagePerRent(int maxMilagePerRent){this.maxMilagePerRent=maxMilagePerRent;}


        public void setMilageLimit(){this.milageLimit = milageLimit;}

        public boolean hasAc(){return  ac;}

        public void setAc(boolean ac){this.ac= ac;}

        public boolean hasGps(){return gps;}

        public  void setGps(boolean gps){this.gps=gps;}

        public Gearbox getGearbox(){return gearbox;}

        public void setGearbox(Gearbox gearbox){this.gearbox=gearbox;}

        public FuelType getFuelType(){return  fuelType;}

        public void setFuelType(FuelType fuelType){this.fuelType=fuelType;}

        public VehicleCategory getVehicleCategory(){return  vehicleCategory;}

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
                "id='" + id + '\'' +
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

    public void isReserved(boolean reserved) {this.reserved=reserved;}

}
