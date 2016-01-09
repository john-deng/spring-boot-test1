package cn.vpclub;

import cn.vpclub.spring.mail.MailSender;
import cn.vpclub.spring.mail.MockMailSender;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by XTL on 8/14/2014.
 */
@RestController
public class Controller {

    private MailSender mailSender = new MockMailSender(); // example of explicit instantiation which is a bad idea.

    @RequestMapping(value = "/sendmail", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String sendmail(@RequestParam("to") String to, @RequestParam("subject") String subject, @RequestParam("body") String body) {

        mailSender.send(to, subject, body);

        return "Mail is sent to " + to + " successfully!";
    }

    @RequestMapping("/")
    public String home() {
        return "Hello, world";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public User index(@RequestParam("id") int id, @RequestParam("name") String name) {

        return new User(name, id);
    }

}
