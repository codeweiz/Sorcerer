package cn.microboat.controller;

import cn.microboat.common.Return;
import cn.microboat.mapper.StudentMapper;
import cn.microboat.pojo.entity.Student;
import cn.microboat.pojo.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author zhouwei
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentMapper studentMapper;

    @Autowired
    StudentController(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @GetMapping("/test1")
    public Return<StudentVo> test1() {
        Student student = new Student("zhangsan", 1, LocalDateTime.now());
        StudentVo studentVo = studentMapper.entityToModel(student);
        return Return.succeed(studentVo);
    }

    @GetMapping("/test2")
    public Return<Student> test2() {
        StudentVo studentVo = new StudentVo("zhangsan", "男", "2021-09-12 09:45:09");
        Student student = studentMapper.modelToEntity(studentVo);
        return Return.succeed(student);
    }
}
