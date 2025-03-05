package pack.age.uni;

import java.util.ArrayList;

public class Presentedcourse {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Presentedcourse> presentedcourselist = new ArrayList<>();
    public int courseID;
    public int professorID;
    public int capacity = 0;
    public int maxcapacity;
    public ArrayList<Integer> studentIDs;
    public String coursename;
    public int courseunit;

    public Presentedcourse (int courseID, int professorID, int maxcapacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.maxcapacity = maxcapacity;
        presentedcourselist.add(this);
        ID = IDkeep;
        IDkeep++;
        this.studentIDs = new ArrayList<>();
        coursename = Course.findbyID(courseID).title;
        courseunit = Course.findbyID(courseID).units;
    }

    public static Presentedcourse findbyID (int ID) {
        if (presentedcourselist.get(ID) == null) {
            return null;
        } else {
            return presentedcourselist.get(ID);
        }
    }

    public void addStudent (int studentID) {
        if (capacity >= maxcapacity) {
            System.out.println("Capacity is full!");
        } else {
            studentIDs.add(studentID);
        }
    }

    public boolean findID (int studentID) {
        return studentIDs.contains(studentID);
    }
}