package cn.vpclub.spring.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by johnd on 1/9/16.
 */
@Primary
@Component
public class SmtpMailSender implements MailSender {
    private static final Logger logger = LoggerFactory.getLogger(SmtpMailSender.class);

    @Override
    public void send(String to, String subject, String body) {
        logger.info("Sending smtp mail to: " + to);
        logger.info("Subject: " + subject);
        logger.info("Body: " + body);
    }
}
