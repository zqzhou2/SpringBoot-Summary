package boot.sum;

import boot.sum.domain.Student;
import boot.sum.domain.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void test() throws Exception {
        Student student = new Student();
        student.setName("里斯");
        student.setAge(12);
        student.setInsertTime(new Date());
        //studentRepository.add(student);

        Student student1 = studentRepository.findById("38f510ea-921b-44c5-bbd4-e5b58d43c235");
        List<Student> studentList = studentRepository.findByName("张三");

        System.out.println(123);
    }
}
