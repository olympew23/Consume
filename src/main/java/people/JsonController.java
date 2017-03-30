package people;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jerieshasmith on 3/30/17.
 */
@Controller
@RequestMapping("/api")
public class JsonController {

    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
        logger.debug("I am in the controller and got ID: " + id.toString());
        logger.debug("I am in the controller and got username: " + user.toString());
        logger.debug("I am in the controller and got address:" + user.toString());
        logger.debug("I am in the controller and got email:" + user.toString());
        logger.debug("I am in the controller and got password:" + user.toString());
        logger.debug("I am in the controller and got phonenumber:"+ user.toString());
        return new User("Mary Little","555 Houselane", "mary@pickel.com","hotchips","773-209-3578");
    }

}
