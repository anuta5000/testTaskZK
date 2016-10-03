
package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Анна
 */
public class Adress implements Serializable {
    
    @Id
    private int ID;
    
    @Column(name = "city")
    private String city;
    
    @Column(name = "street")
    private String street;
    
    @Column(name = "house")
    private int house;
    
    @Column(name = "zipcode")
    private int zipcode;
    
    @Column(name = "flat")
    private int flat;
    
     public Adress  (String city, String street, int house) {
        setCity(city);
        setStreet(street);
        setHouse(house);
    }
     
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    } 
     
    public String getCity() {
        return city;
    }
 
    public void setCity(String value) {
        city = value;
    }
    
    public String getStreet() {
        return street;
    }
 
    public void setStreet(String value) {
        street = value;
    }
    
    public int getHouse() {
        return house;
    }
 
    public void setHouse(int value) {
        house = value;
    }
    
    public int getZipcode() {
        return zipcode;
    }
 
    public void setZipcode(int value) {
        zipcode = value;
    }
    
    public int getFlat() {
        return flat;
    }
 
    public void setFlat(int value) {
        flat = value;
    }
   
    
}
