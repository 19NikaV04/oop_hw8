package Урок_8;

import java.util.List;
import java.util.ArrayList;

public class TeacherService {

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void editTeacher(int index, Teacher teacher) {
        teachers.set(index, teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}
