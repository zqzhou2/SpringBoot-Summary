package boot.sum.controller;

import boot.sum.model.Student;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zqzhou2 on 2017/6/7.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    static Student student;

    /**
     * @ApiOperation注解来给API增加说明、通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明
     */

    @ApiOperation(value = "获取学生信息", notes = "")
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public Student get() {
        return this.student;
    }

    @ApiOperation(value = "创建学生信息", notes = "根据Student对象创建学生信息")
    @ApiImplicitParam(name = "student", value = "学生信息实体student")
    @RequestMapping(value = "set", method = RequestMethod.POST)
    public Student set(@ModelAttribute Student student) {
        this.student = student;
        return this.student;
    }

    //paramType 有五个可选值 ： path, query, body, header, form
    @ApiOperation(value = "获取学生详细信息", notes = "根据url的name来获取学生详细信息")
    @ApiImplicitParam(name = "name", value = "学生姓名", required = true, dataType = "String", paramType = "path")
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Student getByName(@PathVariable String name) {
        if (this.student.getName().equals(name)) {
            return this.student;
        }
        return null;
    }

    @ApiOperation(value = "获取学生详细信息", notes = "根据url的参数name来获取学生详细信息")
    @ApiImplicitParam(name = "name", value = "学生姓名", required = false, dataType = "String", paramType = "query")
    @RequestMapping(value = "/getBy", method = RequestMethod.GET)
    public Student getBy(@RequestParam String name) {
        if (this.student.getName().equals(name)) {
            return this.student;
        }
        return null;
    }
}
