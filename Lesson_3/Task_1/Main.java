package Lesson_3.Task_1;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.addStudent("Павел", 18);
        service.addStudent("Мария", 19);
        service.addStudent("Александр", 21);
        service.addStudent("Наталья", 20);
        System.out.println(service.getStudentInfo());
        service.sortByName();
        System.out.println(service.getStudentInfo());
        service.sortByAge();
        System.out.println(service.getStudentInfo());
    }
}
