package com.gentech.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    @GetMapping("/firstname/{fn}")
    public String getFirstName(@PathVariable String fn)
    {
        return "The First Name of the Student "+fn;
    }

    @GetMapping("/loc/{place}")
    public String getLocation(@PathVariable("place") String location)
    {
        return "The Location of teh Student "+location;
    }

    @GetMapping("/details/{fn}/{loc}")
    public String getDetails(@PathVariable String fn, @PathVariable String loc)
    {
        return "First Name :"+fn+" and Location :"+loc;
    }


    @GetMapping("/students1")
    public Student[] getStudents()
    {
        Student obj[]={
                new Student("Manjunath","manju@gmail.com","Kolar"),
                new Student("Rohit","rohit@gmail.com","Tumkur")
        };
        return  obj;
    }

    @GetMapping("/students2")
    public List<Student> getStudents2()
    {
        List<Student> obj=new ArrayList<>();
        obj.add(new Student("Vijay","vijay@gmail.com","Hassan"));
        obj.add(new Student("Gopal","gopal@gmail.com","Dallas"));
        obj.add(new Student("Vinith","vinu@gmail.com","Boston"));
        return obj;
    }
}
