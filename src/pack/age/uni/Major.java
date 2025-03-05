package pack.age.uni;

import java.util.ArrayList;

public class Major {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Major> majorlist = new ArrayList<>();
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        majorlist.add(this);
        ID = IDkeep;
        IDkeep++;
    }

    public static Major findbyID (int ID) {
        if (majorlist.get(ID) == null) {
            return null;
        } else {
            return majorlist.get(ID);
        }
    }

    public void addStudent() {
        if (numberOfStudents >= capacity) {
            System.out.println("Capacity is full!");
        } else {
            numberOfStudents++;
        }
    }
}