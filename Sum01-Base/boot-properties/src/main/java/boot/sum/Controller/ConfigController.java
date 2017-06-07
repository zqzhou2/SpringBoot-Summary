package boot.sum.Controller;

import boot.sum.model.BootProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@RestController
public class ConfigController {

    @Autowired
    BootProperties bootProperties;

    @RequestMapping("/config")
    public BootProperties getProperties() {
        return this.bootProperties;
    }
}
