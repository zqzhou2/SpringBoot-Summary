package boot.sum.service;

import boot.sum.model.Student;

import java.util.List;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
public interface StudentService {

    void add(Student student);
    Student find(String id);
    List<Student> find();
}
