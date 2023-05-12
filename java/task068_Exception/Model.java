package task068_Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Model {
  private String surname;
  private String name;
  private String middleName;
  private String birthday;
  private Integer phone;
  private String gender;

  public String getSurname() {
    return surname;
  }

  public String getName() {
    return name;
  }

  public String getMiddleName() {
    return middleName;
  }

  public String getBirthday() {
    return birthday;
  }

  public Integer getPhone() {
    return phone;
  }

  public String getGender() {
    return gender;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public void setBirthday(String birthday) throws ParseException {
    this.birthday = new SimpleDateFormat("dd.mm.yyyy")
        .format(new SimpleDateFormat("dd.mm.yyyy").parse(birthday));
  }

  public void setPhone(String phone) throws NumberFormatException {
    this.phone = Integer.parseInt(phone);
  }

  public void setGender(String gender) throws IncorrectGenderException {
    if (gender.equals("m") || gender.equals("f")) {
      this.gender = gender;
    } else {
      throw new IncorrectGenderException("Неверный пол");
    }
  }

  @Override
  public String toString() {
    return this.surname + " " + this.name + " " + this.middleName + " " + this.birthday + " " + this.phone + " "
        + this.gender;
  }
}
