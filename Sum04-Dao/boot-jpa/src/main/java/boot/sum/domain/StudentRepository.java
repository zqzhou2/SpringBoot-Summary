package boot.sum.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by zqzhou2 on 2017/6/8.
 */

public interface StudentRepository extends JpaRepository<Student, String> {

    /**
     * Jpa特性：解析方法名称创建查询
     */

    //通过name查询Student实体集合
    List<Student> findByName(String name);

    //通过id查询Student实体
    Student findById(String id);

//    //根据query语句查询
//    @Query(value = "select id,name,age,insert_time from Student c where c.age > :age")
//    List<Customer> getByMinAge(@Param("age") int minAge);
//
//    void add(Student student);
//
//    List<Student> find();
}
