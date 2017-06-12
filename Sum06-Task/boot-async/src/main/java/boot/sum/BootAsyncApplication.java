package boot.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by zqzhou2 on 2017/6/12.
 */
@SpringBootApplication
@EnableAsync
public class BootAsyncApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootAsyncApplication.class, args);
    }
}
