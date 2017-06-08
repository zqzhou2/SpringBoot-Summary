package boot.sum.dao;

import boot.sum.model.Student;

import java.util.List;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
public interface StudentDao {

    void add(Student student);

    List<Student> find();

    Student find(String id);

}
