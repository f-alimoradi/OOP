package pack.age.uni;

import java.util.ArrayList;

public class Course {
    public int ID;
    public static int IDkeep = 0;
    public static ArrayList<Course> courselist = new ArrayList<>();
    public String title;
    public int units;

    public Course (String title, int units) {
        this.title = title;
        this.units = units;
        courselist.add(this);
        ID = IDkeep;
        IDkeep++;
    }

    public static Course findbyID (int ID){
        if (courselist.get(ID) == null) {
            return null;
        } else {
            return courselist.get(ID);
        }
    }
}