package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yu Zhang on 2018-01-19.
 */


public class goodMood extends mood {
    private String moodContent;

    public goodMood(){
        this.moodContent = "good mood";
    }

    public String getMood(){
        return this.moodContent;
    }

    @Override
    public Boolean isGood() {
        return Boolean.TRUE;
    }
}
