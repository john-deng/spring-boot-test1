package cn.vpclub;

import cn.vpclub.spring.mail.MailSender;
import cn.vpclub.spring.mail.MockMailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by XTL on 8/14/2014.
 */
@RestController
public class Controller {

    private MailSender mailSender;

    // spring dependency injection with @Autowired here and @Primary, @Component in MockMailSender implementation class
    @Autowired
    public Controller(@Qualifier("mock") MailSender mailSender) {
        this.mailSender = mailSender;
    }

    @RequestMapping(value = "/sendmail", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String sendmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("body") String body) {

        return mailSender.send(to, subject, body);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public User index(@RequestParam("id") int id, @RequestParam("name") String name) {

        return new User(name, id);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello, world\n";
    }

}
