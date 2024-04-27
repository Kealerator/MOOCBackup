import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }

    public void add(Person person){
        persons.add(person);
    }

    public boolean isEmpty(){
        return persons.isEmpty();
    }

    public ArrayList<Person> getPersons(){
        return persons;
    }

    public Person shortest(){
        Person returnPerson = new Person("returnPerson", 1000);

        if (persons.isEmpty()) {
            return null;
        }

        for (Person person : persons) {
            if (person.getHeight()  < returnPerson.getHeight()) {
                returnPerson = person;
            }
        }

        return returnPerson;

    }

    public Person take(){
        if (persons.isEmpty()) {
           return null;
        }
        Person shortestPerson = this.shortest();
        this.persons.remove(shortestPerson);

        return shortestPerson;
    }

}
