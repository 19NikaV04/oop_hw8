package Урок_8;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    
    @Override
    public int compare(Teacher teacher1, Teacher teacher2) {
        return teacher1.getAge() - teacher2.getAge();
    }
}
