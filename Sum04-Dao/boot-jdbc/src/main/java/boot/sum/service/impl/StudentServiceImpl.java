package boot.sum.service.impl;

import boot.sum.dao.StudentDao;
import boot.sum.model.Student;
import boot.sum.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentDao studentDao;

    @Override
    public void add(Student student) {
        this.studentDao.add(student);
    }

    @Override
    public Student find(String id) {
        return this.studentDao.find(id);
    }

    @Override
    public List<Student> find() {
        return this.studentDao.find();
    }
}
