package boot.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zqzhou2 on 2017/6/12.
 */
@SpringBootApplication
@EnableScheduling
public class BootScheduledApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootScheduledApplication.class, args);
    }
}
