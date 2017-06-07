package boot.sum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@Controller
public class ViewController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("msg", "freemarker模版引擎渲染视图");
        return "index";
    }
}
