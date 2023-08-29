public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
    }
    Student student = new Student("Hayden", 12345, 1, 4.0);
}

public class Course {
    private String topic;
    private Teacher intructor;
    private ArrayList<Student> enrolledStudents;
}

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
}