package pack.age.uni;

import pack.age.base.Person;

import java.util.ArrayList;

public class Student {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Student> studentlist = new ArrayList<>();
    public int personID;
    public final int enteranceYear;
    public int majorID;
    public String studentID;
    public String name;

    public Student (int personID, int enteranceYear, int majorID) {
        this.personID = personID;

        this.enteranceYear = enteranceYear;
        this.majorID = majorID;
        ID = IDkeep;
        IDkeep++;
        studentlist.add(this);
        Major.majorlist.get(majorID).addStudent();
        setStudentCode();
    }

    public static Student findbyID (int ID){
        if (ID >= 0 && ID < studentlist.size()) {
            return studentlist.get(ID);
        } else {
            return null;
        }
    }

    public void setStudentCode () {
        studentID = enteranceYear + "0" + majorID + "0" + ID;
    }

    public void printStudentinfo () {
        System.out.print(Person.personlist.get(personID).name + " : ");
        System.out.println(studentID);
    }
}
