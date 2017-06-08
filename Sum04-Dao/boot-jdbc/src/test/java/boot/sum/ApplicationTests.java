package boot.sum;

import boot.sum.model.Student;
import boot.sum.service.StudentService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    public void test() throws Exception {
        Student student = new Student();
        String id = UUID.randomUUID().toString();
        student.setId(id);
        student.setName("张三");
        student.setAge(12);
        student.setInsertTime(new Date());
        studentService.add(student);

        Student student1 = studentService.find(id);
        List<Student> studentList = studentService.find();

        System.out.println(123);
    }
}
