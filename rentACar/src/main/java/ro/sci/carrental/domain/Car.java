package ro.sci.carrental.domain;

import  ro.sci.carrental.util.FuelType;
import  ro.sci.carrental.util.VehicleCategory;
/**
 * Created by Radovici Tudor
 */

//todo: replace this with your own implementation
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
        private boolean gearbox = false; //TRUE automatic, FALSE manual
        private FuelType fuelType;
        private VehicleCategory vehicleCategory;

        /**
         * Constructorul default
         */
        public Car() {}

    /**
     *
     * @param make
     * @param model
     * @param size
     * @param color
     * @param seats
     * @param doors
     * @param ac
     * @param gps
     * @param gearbox
     * @param power
     * @param fuelType
     * @param vehicleCategory
     */
        public Car(String make, String model, float size, String color, int seats, int doors,int power, int minAgeRequired, int maxMilagePerRent, boolean milageLimit, boolean ac, boolean gps, boolean gearbox, FuelType fuelType, VehicleCategory vehicleCategory) {
            this.make = make;
            this.model = model;
            this.size = size;
            this.color = color;
            this.seats = seats;
            this.doors = doors;
            this.power = power;
            this.minAgeRequired= minAgeRequired;
            this.minAgeRequired=minAgeRequired;
            this.milageLimit=milageLimit;
            this.ac = ac;
            this.gps = gps;
            this.gearbox = gearbox;
            this.fuelType = fuelType;
            this.vehicleCategory = vehicleCategory;
        }



        public String getMake() {
            return make;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

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

        public boolean isAc() {
            return ac;
        }

        public void setAc(boolean ac) {
            this.ac = ac;
        }

        public boolean isGps() {
            return gps;
        }

        public void setGps(boolean gps) {
            this.gps = gps;
        }

        public boolean isGearbox() {
            return gearbox;
        }

        public void setGearbox(boolean gearbox) {
            this.gearbox = gearbox;
        }

        public FuelType getFuelType() {
            return fuelType;
        }

        public void setFuelType(FuelType fuelType) {
            this.fuelType = fuelType;
        }

        public VehicleCategory getVehicleCategory() {
            return vehicleCategory;
        }

        public void setVehicleCategory(VehicleCategory vehicleCategory) {
            this.vehicleCategory = vehicleCategory;
        }
}
