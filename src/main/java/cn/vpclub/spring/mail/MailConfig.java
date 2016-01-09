package cn.vpclub.spring.mail;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by johnd on 1/9/16.
 */

@Configuration
public class MailConfig {

    @Bean
    public MailSender mockMailSender() {return new MockMailSender();
    }

    @Bean
    public MailSender smtpMailSender() {
        return new SmtpMailSender();
    }
}
