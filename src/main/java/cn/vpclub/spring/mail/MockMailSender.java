package cn.vpclub.spring.mail;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by johnd on 1/9/16.
 */


public class MockMailSender implements MailSender {
    private static final Logger logger = LoggerFactory.getLogger(MockMailSender.class);

    @Override
    public String send(String to, String subject, String body) {
        logger.info("Sending mail to: " + to);
        logger.info("Subject: " + subject);
        logger.info("Body: " + body);

        return "Mail sent to " + to + " by " + MockMailSender.class + " successfully! \n";
    }
}
