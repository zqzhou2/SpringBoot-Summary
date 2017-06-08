package boot.sum.dao.impl;

import boot.sum.dao.StudentDao;
import boot.sum.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by zqzhou2 on 2017/6/8.
 */
@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Student student) {
        jdbcTemplate.update("insert into student(id,name,age,insert_time) values(?,?,?,?)", UUID.randomUUID().toString(), student.getName(), student.getAge(), new Date());
    }

    @Override
    public List<Student> find() {
        RowMapper<Student> rm = new BeanPropertyRowMapper<Student>(Student.class);
        return jdbcTemplate.query("select * from student", rm);
    }

    @Override
    public Student find(String id) {
        String sql = "select * from student where id = ?";
        RowMapper<Student> rm = new BeanPropertyRowMapper<Student>(Student.class);
        List<Student> list = jdbcTemplate.query(sql, new Object[]{"38f510ea-921b-44c5-bbd4-e5b58d43c235"}, rm);
        if (null != list && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }
}
