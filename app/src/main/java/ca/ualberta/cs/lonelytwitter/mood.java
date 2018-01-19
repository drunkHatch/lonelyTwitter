package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by Yu Zhang on 2018-01-19.
 */

public abstract class mood {
  private Date date;

  public mood(){
    this.date = new Date();
  }

  public mood(Date date){
    this.date = date;
  }

  public void setDate(Date date) {
      this.date = date;
  }

  public Date getDate() {
      return this.date;
  }

  public abstract Boolean isGood();
}
