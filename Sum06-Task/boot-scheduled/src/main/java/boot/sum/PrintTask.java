package boot.sum;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zqzhou2 on 2017/6/12.
 */
@Component
public class PrintTask {

    @Scheduled(fixedRate = 3000)
    private void sayHello() {
        System.out.println("hello scheduled task.");
    }
}
