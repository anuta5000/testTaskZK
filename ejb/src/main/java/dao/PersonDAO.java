
package dao;

import java.util.ArrayList;
import java.util.List;
import entity.Person;
import entity.Adress;

/**
 *
 * @author Анна
 */


public class PersonDAO {
        
    private List<Person> persons = new ArrayList<Person>();
    private List<Adress> adresses;
      
      public PersonDAO() {

      }
      
      public List<Person> getPersonList() {
          return persons;
      }
      
      public List<Adress> getPersonAdressList(int personId) {
          return adresses;
      }
 
}
