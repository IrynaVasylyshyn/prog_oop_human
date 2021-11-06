package human;

import human.exceptions.StudentException;

import java.util.*;
import java.util.logging.Logger;

public class Group {

    private Student[] students = new Student[10];

    public static final Logger log = Logger.getLogger(Group.class.getName());

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) throws StudentException {
        if (student != null) {
            for (int i = 0; i < students.length; i ++){
                if (students[i] != null && student.equals(students[i])) {
                    log.info("This " + student.toString() + " has already been added to the group");
                    return;
                }
                if (students[i] == null) {
                    students[i] = student;
                    log.info("This " + student.toString() + " has been successfully added to the group");
                    return;
                }
            }
            throw new StudentException();
        }
    }

    public void delStudent(long gradebook) {
        if (students !=null) {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null && gradebook == students[i].getGradebook()) {
                    students[i] = null;
                    log.info("The student has been removed from the group");
                    return;
                }
            }
            log.warning("Cannot find this student, please check is data correct");
        }
    }

    public List<Student> findStudentBySurname(String surname) {
        List<Student> stdList = new ArrayList<>();
        for (int i = 0; i < students.length; i++) {
            if(students[i] != null && students[i].getSurname().equals(surname)) {
                stdList.add(students[i]);
            }
        }
        log.info("Find " + stdList.size() + " student(s)");
        return stdList.size() == 0 ? Collections.emptyList() : stdList;
    }


    @Override
    public String toString() {
        List<Student> stdList = Arrays.asList(students);
        stdList.sort(Student.studentComparatorBySurname);
        return "Group{" +
                "students=" + stdList +
                '}';
    }
}
