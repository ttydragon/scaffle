package scaffle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Iryna on 12.03.2015.
 */
@RestController
public class BookController {
    @RequestMapping("/")
    public String index() {
        return "Do you like books?";
    }
}
