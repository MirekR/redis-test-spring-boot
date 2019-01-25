package cz.mirek.redis.redistest.controller;

import cz.mirek.redis.redistest.domain.Student;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("redis")
@Controller
@CacheConfig( cacheNames = "studentCache")
public class StudentController {

    @GetMapping("/student")
    @ResponseBody
    @Cacheable
    public Student getStudent(String studentName) throws InterruptedException {
        System.out.println("I'm creating new student but waiting 5s first to show advantaged");
        Thread.sleep(5_000);
        Student student = new Student();
        student.gender = Student.Gender.MALE;
        student.name = studentName;

        return student;
    }
}
