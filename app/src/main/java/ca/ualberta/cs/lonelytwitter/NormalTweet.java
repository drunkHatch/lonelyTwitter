package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    //public addTweetTask(String message){
        //;
    //}

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
