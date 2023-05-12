package task067_Exceptions;

import java.io.IOException;
import java.util.Date;

public class SaveEsception extends IOException {
  private Date startDate;

  public SaveEsception(String message, Date startDate, Exception e) {
    super(message, e);
    this.startDate = startDate;
  }

  public Date getStartDate() {
    return startDate;
  }
}
