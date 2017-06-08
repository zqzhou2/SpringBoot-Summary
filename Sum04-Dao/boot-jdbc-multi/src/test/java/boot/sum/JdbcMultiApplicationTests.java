package boot.sum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcMultiApplicationTests {

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    private JdbcTemplate primaryJdbcTemplate;

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    private JdbcTemplate secondaryJdbcTemplate;

    @Test
    public void test() throws Exception {
        primaryJdbcTemplate.update("insert into student(id,name,age,insert_time) values (?,?,?,?)", UUID.randomUUID().toString(), "张三", 12, new Date());

        secondaryJdbcTemplate.update("insert into student(id,name,age,insert_time) values (?,?,?,?)", UUID.randomUUID().toString(), "里斯", 13, new Date());
    }
}
