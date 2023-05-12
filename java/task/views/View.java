package task.views;

import task.models.Student;

public class View {
  public void getStudent(Student student) {
    System.out.println(student.getName() + " " + student.getAge() + " " + student.getGrade());
  }
}
