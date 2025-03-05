package pack.age.uni;

import pack.age.base.Person;
import java.util.HashMap;

public class Transcriped {

    public int studentID;
    public HashMap<Integer, Double> transcriped;

    public Transcriped(int studentID) {
        this.studentID = studentID;
        this.transcriped = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {

        transcriped.put(presentedCourseID, grade);
    }

    public void printTranscriped() {
        Student student = Student.findbyID(studentID - 1);
        if (student != null) {
            Person person = Person.findbyID(student.personID);
            System.out.println(person.name);
            System.out.println(student.studentID);
        }

        for (Integer courseID : transcriped.keySet()) {
            Presentedcourse presentedCourse = Presentedcourse.findbyID(courseID);
            if (presentedCourse != null) {
                Course course = Course.findbyID(presentedCourse.courseID);
                if (course != null) {
                    System.out.println(course.title + ": " + transcriped.get(courseID));
                }
            }
        }
    }

    public double getGPA() {
        double totalGradePoints = 0;
        int totalUnits = 0;

        for (Integer courseID : transcriped.keySet()) {
            Presentedcourse presentedCourse = Presentedcourse.findbyID(courseID);
            if (presentedCourse != null) {
                Course course = Course.findbyID(presentedCourse.courseID);
                if (course != null) {
                    totalGradePoints += transcriped.get(courseID) * course.units;
                    totalUnits += course.units;
                }
            }
        }

        if (totalUnits == 0) {
            return 0;
        }

        return totalGradePoints / totalUnits;
    }
}