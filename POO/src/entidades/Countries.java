/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Elsner
 */
public class Countries {
    
    //atributos
    private String country_id;
    private String country_name;
    private int region_id;

    //constructor
    public Countries() {
    }
        
    public Countries(String country_id, String country_name, int region_id) {
        this.country_id = country_id;
        this.country_name = country_name;
        this.region_id = region_id;
    }
    
    //metodos  
    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }
}
