package Lesson_3.Task_1.Group;


import Lesson_3.Task_1.Student.Student;
import Lesson_3.Task_1.Student.Comparators.StudentComparatorByAge;
import Lesson_3.Task_1.Student.Comparators.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;
    public StudyGroup(){
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName());
    }
    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }
}
