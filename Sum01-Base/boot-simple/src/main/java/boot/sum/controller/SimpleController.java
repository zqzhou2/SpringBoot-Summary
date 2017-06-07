package boot.sum.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@RestController
public class SimpleController {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test(String key) {
        return "hello " + key;
    }
}
