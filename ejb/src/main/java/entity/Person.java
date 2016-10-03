
package entity;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import entity.Adress;

/**
 *
 * @author Анна
 */
public class Person implements Serializable {
    
    @Id
    private int ID;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "middleName")
    private String middleName;
    
    @Column(name = "mobilePhone")
    private long mobilePhone;
    
    @OneToMany(mappedBy = "persons", fetch = FetchType.LAZY)
    private List<Adress> adresses = new ArrayList<Adress>();

    @Entity
    @Table(name = "persons")
    public Person (String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }
    
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String value) {
        firstName = value;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String value) {
        lastName = value;
    }
    
    public String getMiddleName() {
        return middleName;
    }
 
    public void setMiddleName(String value) {
        middleName = value;
    }
    
    public long getMobilePhone() {
        return mobilePhone;
    }
 
    public void setMobilePhone(long value) {
        mobilePhone = value;
    }
    
    public List<Adress> getAdresses() {
        return adresses;
    }
 
    public void setAdresses(List<Adress> list) {
        adresses = list;
    }
 
}
