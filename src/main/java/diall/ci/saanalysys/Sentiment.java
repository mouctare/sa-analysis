package diall.ci.saanalysys;

public class Sentiment {
    int id;
    String message;
    int status;

    public Sentiment(int id, String message, int status) {
        this.id = id;
        this.message = message;
        this.status = status;
    }
}
