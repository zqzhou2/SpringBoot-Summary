package boot.sum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String key) {
        return "param " + key;
    }
}
