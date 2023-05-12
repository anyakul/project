package task067_Exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class program {
  public static void main(String[] args) {
    try (FileReader reader = new FileReader("./task064/data.json");
        FileWriter writer = new FileWriter("./task064/test.json")) {
      while (reader.ready()) {
        writer.write(reader.read());
      }
    } catch (RuntimeException | IOException e) {
      System.out.println("catch exception " + e.getClass().getSimpleName());
    }

    try {
      System.out.println("test operation");
    } finally {
      System.out.println("finally operation");
    }
    System.out.println("Copy successful");
  }

  public void save() throws SaveEsception {
    Date date = new Date();
    System.out.println("save document startd...");
    try (FileWriter writer = new FileWriter("./task064/test.json")) {
      throw new IOException("operation failed");
    } catch (IOException e) {
      System.out.println(e.getMessage());
      throw new SaveEsception("Saved document failed", date, e);
    }
  }
}
