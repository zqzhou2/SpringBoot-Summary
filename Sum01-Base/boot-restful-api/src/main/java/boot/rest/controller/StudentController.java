package boot.rest.controller;

import boot.rest.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    static Student student;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public Student get(){
        return this.student;
    }

    //http://localhost:8080/student/set
    //body(name:12,age:12)
    @RequestMapping(value = "set",method = RequestMethod.POST)
    public Student set(@ModelAttribute Student student){
        this.student = student;
        return this.student;
    }

    //http://localhost:8080/student/12
    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public Student getByName(@PathVariable String name){
        if(this.student.getName().equals(name)){
            return this.student;
        }
        return null;
    }

    //http://localhost:8080/student/getBy?name=12
    @RequestMapping(value = "/getBy",method = RequestMethod.GET)
    public Student getBy(@RequestParam String name){
        if(this.student.getName().equals(name)){
            return this.student;
        }
        return null;
    }
}
