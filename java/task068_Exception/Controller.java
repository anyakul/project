package task068_Exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Controller {
  public void run() {
    Scanner scan = new Scanner(System.in);
    System.out.println(
        "Напишите строку через пробел: фамилия, имя, отчество, дата рождения, номер телефона и пол. \n Дата рождения должны быть вида dd.mm.yyyy, номер телефона - целое беззнаковое число, пол - f или m");
    String str = scan.nextLine();
    String[] arr = str.split(" ");
    Model user = createUser(arr);
    if (user != null) {
      save(user);
    }
    scan.close();
  }

  private boolean checkString(String[] arr) {
    if (arr.length != 6) {
      return false;
    }

    return true;
  }

  private Model createUser(String[] arr) {
    if (!checkString(arr)) {
      System.out.println("Длина строки должна быть 6 слов.");
      return null;
    } else {
      try {
        Model user = new Model();
        user.setSurname(arr[0]);
        user.setName(arr[1]);
        user.setMiddleName(arr[2]);
        user.setBirthday(arr[3]);
        user.setPhone(arr[4]);
        user.setGender(arr[5]);

        return user;
      } catch (NumberFormatException e) {
        System.out.println("Неверный номер телефона");

        return null;
      } catch (ParseException e) {
        System.out.println("Неверная дата рождения");

        return null;
      } catch (IncorrectGenderException e) {
        System.out.println("Неверный пол");

        return null;
      }
    }
  }

  public void save(Model user) {
    String userStr = user.toString();
    String pathProject = System.getProperty("user.dir");
    String pathFile = pathProject.concat("/task068_Exception/users/" + user.getSurname() + ".txt");

    try (FileWriter writer = new FileWriter(new File(pathFile))) {
      writer.write(userStr);
      writer.close();
    } catch (IOException e) {
      System.out.println("Директория для файла не найдена");
    }
  }
}
