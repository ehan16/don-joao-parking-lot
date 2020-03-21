/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EH
 */
public class Vehicle {
    
    //Atributos de la clase
    private String licensePlate;    //7 caracteres alfanumericos
    private String model;   //20 caracteres alfanumericos
    private String brand;   //20 caracteres alfabeticos
    private String color;   // 10 caracteres alfabeticos
    private int monthlyRent;    //3 caracteres numericos en dolares

    //Constructor de la clase
    public Vehicle(String licensePlate, String model, String brand, String color, int monthlyRent) {
        this.licensePlate = licensePlate.toUpperCase(); //Para mantener consistencia
        this.model = model.toUpperCase();
        this.brand = brand.toUpperCase();
        this.color = color.toUpperCase();
        this.monthlyRent = monthlyRent;
    }
    
    //Getters y setters

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }
    
    @Override
    public String toString(){
        
        return this.licensePlate;
        
    }
    
}
