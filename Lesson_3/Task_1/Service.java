package Lesson_3.Task_1;

import Lesson_3.Task_1.Group.StudyGroup;
import Lesson_3.Task_1.Student.Student;

public class Service {
    private int id;
    private StudyGroup studyGroup;
    public Service(){
        studyGroup = new StudyGroup();
    }

    public void addStudent(String name, int age){
        Student student = new Student(id++, name, age);
        studyGroup.addStudent(student);
    }

    public String getStudentInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Студенты:\n");
//        Iterator<Student> iterator = studyGroup.iterator();
//        while(iterator.hasNext()){
//            Student student = iterator.next();
//            sb.append(student).append("\n");
//        }
        for (Student student : studyGroup) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }

    public void sortByName(){
        studyGroup.sortByName();
    }
    public void sortByAge(){
        studyGroup.sortByAge();
    }
}
