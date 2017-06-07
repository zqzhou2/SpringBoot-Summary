package boot.sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@RestController
public class TestController {

    static Logger logger = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String key) {
        logger.info("info msg");
        logger.warn("warn msg");
        logger.error("error msg");

        return "param " + key;
    }
}
