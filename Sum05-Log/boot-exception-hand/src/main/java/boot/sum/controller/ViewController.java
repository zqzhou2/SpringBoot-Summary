package boot.sum.controller;

import boot.sum.dto.BizException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@Controller
public class ViewController {

    @RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("msg", "thymeleaf模版引擎渲染视图");
        return "index";
    }

    @RequestMapping("/test")
    public String test() throws Exception {
        throw new Exception("error");
    }

    @RequestMapping("/biz")
    public String biz() throws BizException {
        throw new BizException("biz error");
    }
}
