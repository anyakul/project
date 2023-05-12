package task.repository;

import java.util.ArrayList;

import task.models.Student;

public class Repository {
  ArrayList<Student> list = new ArrayList<>();

  public void put(Student student) {
    list.add(student);
  }

  public boolean getStudentByName(String name) {
    for (Student student : list) {
      if (student.getName().equals(name)) {
        return true;
      }
    }

    return false;
  }

  public ArrayList<Student> getList() {
    return list;
  }
}
