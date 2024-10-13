package com.example.ShopClothes.backend.Service;

import com.example.ShopClothes.backend.Entity.Student;
import com.example.ShopClothes.backend.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    private  final StudentRepo studentRepo; // Đảm bảo rằng @Autowired được thêm vào đây

    @Autowired
    public StudentService(StudentRepo studentRepository) {
        this.studentRepo = studentRepository;
    }

    public void saveDetails(Student student) {
        studentRepo.save(student); // Sử dụng studentRepo sau khi nó được inject
    }


}
