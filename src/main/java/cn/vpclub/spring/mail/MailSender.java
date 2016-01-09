package cn.vpclub.spring.mail;

/**
 * Created by johnd on 1/9/16.
 */
public interface MailSender {
    String send(String to, String subject, String body);
}
