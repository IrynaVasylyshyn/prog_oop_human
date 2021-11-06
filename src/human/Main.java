package human;

import human.exceptions.StudentException;

import java.util.logging.Logger;


public class Main {

    public static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] arg) {
        Human human1 = new Student("Roman", "Rozdobudko", Gender.MALE, "group1", 1234501);
        Human human2 = new Student("Iren", "Rozdobudko", Gender.FEMALE, "group1", 1234502);
        Human human3 = new Student("Peter", "Broysman",  "American", 18,  Gender.MALE, "group1", 1234503);
        Human human4 = new Student("Mark", "Twen",  "American", 18,  Gender.MALE, "group1", 1234504);
        Human human5 = new Student("Daria", "Romani",  "Australian", 17,  Gender.FEMALE, "group1", 1234505);
        Human human6 = new Student("Eva", "Polka",  "Sweden", 17,  Gender.FEMALE, "group1", 1234506);
        Human human7 = new Student("Wally", "Earth", Gender.MALE, "group1", 1234507);
        Human human8 = new Student("Max", "Dogger", Gender.FEMALE, "group1", 1234508);
        Human human9 = new Student("Lili", "Salivan",  "Ukrainian", 17,  Gender.FEMALE, "group1", 1234509);
        Human human10 = new Student("Garry", "Pitt",  "American", 18,  Gender.MALE, "group1", 1234510);
        Human human11 = new Student("Next", "Next",  "Russian", 20,  Gender.MALE, "group1", 1234511);

        Group group1 = new Group();

        //ADD STUDENT
        try {
            group1.addStudent((Student) human2);
            group1.addStudent((Student) human2);
            group1.addStudent((Student) human3);
            group1.addStudent((Student) human1);
            group1.addStudent((Student) human4);
            group1.addStudent((Student) human5);
            group1.addStudent((Student) human6);
            group1.addStudent((Student) human7);
            group1.addStudent((Student) human8);
            group1.addStudent((Student) human9);
            group1.addStudent((Student) human7);
            group1.addStudent((Student) human10);
            group1.addStudent((Student) human11);
        } catch (StudentException e) {
            log.warning(e.getMessage());
        }

        //DEL STUDENT

        group1.delStudent(1234507);
        group1.delStudent(1234503);


        //FIND STUDENT

        group1.findStudentBySurname("Rozdobudko");

        //VIEW GROUP

        System.out.println(group1.toString());

    }
}
