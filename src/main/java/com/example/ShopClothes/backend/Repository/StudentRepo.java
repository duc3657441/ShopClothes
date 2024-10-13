package com.example.ShopClothes.backend.Repository;

import com.example.ShopClothes.backend.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    // Bạn có thể thêm các phương thức tùy chỉnh tại đây nếu cần
}