package boot.properties.Controller;

import boot.properties.model.BootProperties;
import com.alibaba.fastjson.JSON;
import jdk.nashorn.internal.ir.debug.JSONWriter;
import jdk.nashorn.internal.parser.JSONParser;
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
