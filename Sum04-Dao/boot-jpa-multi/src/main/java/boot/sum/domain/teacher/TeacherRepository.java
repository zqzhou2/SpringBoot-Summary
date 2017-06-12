package boot.sum.domain.teacher;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zqzhou2 on 2017/6/12.
 */
public interface TeacherRepository extends JpaRepository<Teacher, String> {
    List<Teacher> findByName(String name);
    Teacher findById(String id);
}
