package task.models;

public class Student {
  private String name;
  private Integer age;
  private Integer grade;

  public Student() {

  }

  public String getName() {
    return this.name;
  }

  public Integer getAge() {
    return this.age;
  }

  public Integer getGrade() {
    return grade;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setGrade(Integer grade) {
    this.grade = grade;
  }
}
