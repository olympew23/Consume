package people;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by jerieshasmith on 3/29/17.
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {

            User u = restTemplate.getForObject(
                    "https://gentle-castle-77593.herokuapp.com/user/1", User.class);

                    User user = new User("Mary Little","555 HouseLane","mary@pickle.com","hotchips","773-209 4121");

                    User returns = restTemplate.postForObject("https://gentle-castle-77593.herokuapp.com/user",user,User.class);

            log.info(u.toString());
        };
    }


        }
