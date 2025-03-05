import pack.age.base.Person;
import pack.age.uni.*;

public class Main {
    public static void main(String[] args) {

        Person maryam = new Person("maryam", "12345");
        Person gholi = new Person("gholi", "23451");
        Person mamad = new Person("mamad", "34512");
        Person soltan = new Person("soltan", "45123");
        Person hasti = new Person("hasti", "51234");

        Major CS = new Major("CS", 5);
        Major physics = new Major("physics", 5);

        Student std1 = new Student(0,403, 0);
        Student std2 = new Student(1,402, 0);
        Student std3 = new Student(2,403, 1);

        std1.printStudentinfo();
        std2.printStudentinfo();
        std3.printStudentinfo();

        Professor pro1 = new Professor(3, 0);
        Professor pro2 = new Professor(4, 1);

        pro1.printProfessorinfo();
        pro2.printProfessorinfo();

        Course math = new Course("math", 2);
        Course statistics = new Course("statistics", 2);
        Course cosmology = new Course("cosmology", 3);

        Presentedcourse prscr1 = new Presentedcourse(0,0,4);
        Presentedcourse prscr2 = new Presentedcourse(1, 0, 4);
        Presentedcourse prscr3 = new Presentedcourse(2,1,4);

        prscr1.studentIDs.add(0);
        prscr1.studentIDs.add(1);
        prscr2.studentIDs.add(0);
        prscr2.studentIDs.add(1);
        prscr2.studentIDs.add(2);
        prscr3.studentIDs.add(2);

        Transcriped transstd1 = new Transcriped(1);
        transstd1.setGrade(0,12.5);
        transstd1.setGrade(1,17.5);
        Transcriped transstd2 = new Transcriped(2);
        transstd2.setGrade(0,16.0);
        transstd2.setGrade(1,15.5);
        Transcriped transstd3 = new Transcriped(3);
        transstd3.setGrade(1,17.0);
        transstd3.setGrade(2,19.5);

        transstd1.printTranscriped();
        transstd2.printTranscriped();
        transstd3.printTranscriped();
    }
}