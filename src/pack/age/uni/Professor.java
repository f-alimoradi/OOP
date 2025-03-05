package pack.age.uni;

import pack.age.base.Person;

import java.util.ArrayList;

public class Professor {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Professor> professorlist;
    public int personID;
    public int majorID;

    public Professor (int personID, int majorID) {
        this.personID = personID;
        this.majorID = majorID;
        professorlist = new ArrayList<>();
        professorlist.add(this);
        ID = IDkeep;
        IDkeep++;
    }

    public static Professor findbyID (int ID){
        if (professorlist.get(ID) == null) {

            return null;
        }
        else {

            return professorlist.get(ID);
        }
    }

    public void printProfessorinfo () {
        System.out.print(Person.personlist.get(personID).name + ": ");
        System.out.println(ID);
    }
}
