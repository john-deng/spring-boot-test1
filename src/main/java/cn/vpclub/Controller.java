package cn.vpclub;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by XTL on 8/14/2014.
 */
@RestController
public class Controller {

    @RequestMapping("/")
    public String home() {
        return "Hello, world";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public User index(@RequestParam("id") int id, @RequestParam("name") String name) {

        return new User(name, id);
    }
}
