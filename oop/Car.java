package oop;

public class Car {
    private String car_name;
    private int car_height;
    private int width;
    private String license_plate_number;

    Car() {
    //无参构造器，来初始化
    }
    public void setCar_Name(String car_name) {
        //公共赋值
        this.car_name = car_name;
    }
    public String getCar_Name() {
        return this.car_name;
    }
    public void setCar_height(int car_height) {
        this.car_height = car_height;
    }
    public int getCar_height() {
        return this.car_height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return this.width;
    }
    public void setLicense_plate_number(String license_plate_number) {
        this.license_plate_number = license_plate_number;
    }
    public String getLicense_plate_number() {
        return license_plate_number;
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.setCar_Name("AH350");
        car.setCar_height(12);
        car.setWidth(12);
        car.setLicense_plate_number("abc");
    }
}

