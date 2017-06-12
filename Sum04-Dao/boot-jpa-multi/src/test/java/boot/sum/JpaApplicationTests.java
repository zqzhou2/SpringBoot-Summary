package boot.sum;

import boot.sum.domain.student.Student;
import boot.sum.domain.student.StudentRepository;
import boot.sum.domain.teacher.Teacher;
import boot.sum.domain.teacher.TeacherRepository;
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

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void test() throws Exception {
        Student student = new Student();
        student.setName("里斯");
        student.setAge(12);
        student.setInsertTime(new Date());
        student.setId(UUID.randomUUID().toString());
        studentRepository.save(student);

        //Student student1 = studentRepository.findById("38f510ea-921b-44c5-bbd4-e5b58d43c235");
        List<Student> studentList = studentRepository.findByName("张三");
        List<Student> studentList1 = studentRepository.findAll();

        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        teacher.setAge(42);
        teacher.setInsertTime(new Date());
        teacher.setId(UUID.randomUUID().toString());
        teacherRepository.save(teacher);

        List<Teacher> teacherList = teacherRepository.findByName("李老师");
        List<Teacher> teacherList2 = teacherRepository.findAll();

        System.out.println(123);
    }
}
