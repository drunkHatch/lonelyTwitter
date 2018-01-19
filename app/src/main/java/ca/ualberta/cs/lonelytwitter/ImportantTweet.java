package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by Yu Zhang on 2018-01-19.
 */

public class ImportantTweet extends Tweet {

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
