package com.example.ShopClothes.backend.Controller;


import com.example.ShopClothes.backend.Entity.Student;
import com.example.ShopClothes.backend.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentSer){
        this.studentService = studentSer;
    }

    public void postDetail(Student studentInput)
    {
        studentService.saveDetails(studentInput);
    }
}
