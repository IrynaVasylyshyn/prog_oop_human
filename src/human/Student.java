package human;

import java.util.Comparator;
import java.util.Objects;

public class Student extends Human implements Comparable {
    private String groupName;
    private long gradebook;

    public Student(String name, String surname, Gender gender, String groupName, long gradebook) {
        super(name, surname, gender);
        this.groupName = groupName;
        this.gradebook = gradebook;
    }

    public Student(String name, String surname, String nationality, int age, Gender gender, String groupName, long gradebook) {
        super(name, surname, nationality, age, gender);
        this.groupName = groupName;
        this.gradebook = gradebook;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getGradebook() {
        return gradebook;
    }

    public void setGradebook(long gradebook) {
        this.gradebook = gradebook;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "surname='" + this.getSurname() + '\'' +
                ", name='" + this.getName() + '\'' +
                ", nationality='" + this.getNationality() + '\'' +
                ", age=" + this.getAge() +
                ", gender=" + this.getGender() +
                ", groupName='" + groupName + '\'' +
                ", gradebook=" + gradebook +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getGradebook() == student.getGradebook() &&
                getGroupName().equals(student.getGroupName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGroupName(), getGradebook());
    }

    @Override
    public int compareTo(Object o) {
        return o != null && o instanceof Student
                ? this.getName().compareTo(((Student) o).getName())
                : -1;
    }

    public static final Comparator<Student> studentComparatorBySurname = (o1, o2) -> {
        if (o1 != null) {
            return o2 != null
                    ? o1.getSurname().toUpperCase().compareTo(o2.getSurname().toUpperCase())
                    : -1;
        } else {
            return 0;
        }
    };

}
