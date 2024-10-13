package com.example.ShopClothes;

import com.example.ShopClothes.backend.Controller.StudentController;
import com.example.ShopClothes.backend.Entity.Student;
import com.example.ShopClothes.backend.Service.StudentService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("")
public class MainView extends HorizontalLayout {
    private final StudentController studentController;

    private VerticalLayout layout = new VerticalLayout();
    private TextField name = new TextField("name");
    private TextField mark = new TextField("mark");
    private Button addButton = new Button("Click");
    private Notification notification = new Notification();
    private Student student = new Student();
    private StudentService studentService;

    @Autowired
    public MainView(StudentController studentControllerInput){
        this.studentController = studentControllerInput;
        addButton.addClickListener(click->{
            if (!name.getValue().trim().isEmpty() && !mark.getValue().trim().isEmpty()){
                student.setMark(Integer.parseInt(mark.getValue()));
                student.setName(name.getValue());
                studentController.postDetail(student);


                notification.setDuration(3000);
                notification.setPosition(Notification.Position.MIDDLE);
                notification.show(name.getValue() + mark.getValue());
            }

        });
        layout.add(name,mark,addButton);
        add(layout);
    }
}