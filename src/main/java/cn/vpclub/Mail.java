package cn.vpclub;

/**
 * Created by XTL on 8/14/2014.
 */
public class Mail {

    private String to;

    private String subject;

    private String body;

    public Mail(String to, String subject, String body) {
        this.to = to;
        this.subject = subject;
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }


}
