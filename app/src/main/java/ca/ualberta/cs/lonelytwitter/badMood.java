package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yu Zhang on 2018-01-19.
 */

public class badMood extends mood {
  private String moodContent;

  public badMood(){
    this.moodContent = "bad mood";
  }

  public String getMood(){
    return this.moodContent;
  }

  @Override
  public Boolean isGood() {
      return Boolean.FALSE;
  }
}
