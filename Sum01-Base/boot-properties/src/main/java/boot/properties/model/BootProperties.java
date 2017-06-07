package boot.properties.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Locale;

/**
 * Created by zqzhou2 on 2017/6/6.
 */
@Component
public class BootProperties {

    @Value("${config.name}")
    private String configName;

    @Value("${server.name}")
    private String serverName;

    @Value("${server.port}")
    private Integer serverPort;

    //随机字符串
    @Value("${random.value}")
    private String value;

    //随机整数
    @Value("${random.int}")
    private Integer number;

    //随机long整数
    @Value("${random.long}")
    private Long bigNumber;

    //100以内随机数
    @Value("${random.int(100)}")
    private Integer random1;

    //100到200随机数
    @Value("${random.int[100,200]}")
    private Integer random2;

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Long getBigNumber() {
        return bigNumber;
    }

    public void setBigNumber(Long bigNumber) {
        this.bigNumber = bigNumber;
    }

    public Integer getRandom1() {
        return random1;
    }

    public void setRandom1(Integer random1) {
        this.random1 = random1;
    }

    public Integer getRandom2() {
        return random2;
    }

    public void setRandom2(Integer random2) {
        this.random2 = random2;
    }
}
