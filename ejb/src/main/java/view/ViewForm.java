

package view;

/**
 *
 * @author Анна
 */
import java.util.ArrayList;
import java.util.List;
import org.zkoss.bind.annotation.Init;
import entity.Person;
import entity.Adress;
import dao.PersonDAO;




public class ViewForm {
    
    private Person selected;
    private List<Adress> adressesList = new ArrayList<Adress>();
    private List<Person> persons = new ArrayList<Person>(new PersonDAO().getPersonList());
    
    
    @Init
    public void init() {   
       // selected = persons.get(0); // Selected First One
    }
    
    public List<Person> getPersonList() {
        return persons;
    }
    
    public void setSelectedPerson(Person selected) {
        this.selected = selected;
        setAdressesList(selected.getAdresses());
    }
 
    public Person getSelectedPerson() {
        return selected;
    }    
 
    public List<Adress> getAdressesList() {
        return adressesList;
    }
    
    public void setAdressesList(List<Adress> list) {
        adressesList = list;
    }

}
