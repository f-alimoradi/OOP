package pack.age.base;

import java.util.ArrayList;

public class Person {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Person> personlist = new ArrayList<>();
    public String name;
    public String nationalID;

    public Person (String name, String nationalID){
        this.name = name;
        this.nationalID = nationalID;
        personlist.add(this);
        ID = IDkeep;
        IDkeep++;
    }

    public static Person findbyID (int ID){
        if (personlist.get(ID) == null) {
            return null;
        } else {
            return personlist.get(ID);
        }
    }
}