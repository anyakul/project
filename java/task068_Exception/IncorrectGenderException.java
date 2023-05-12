package task068_Exception;

import java.io.IOException;

public class IncorrectGenderException extends IOException {

  public IncorrectGenderException(String message) {
    super(message);
  }
}
