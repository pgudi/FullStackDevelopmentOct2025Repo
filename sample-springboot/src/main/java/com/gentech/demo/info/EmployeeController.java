package com.gentech.demo.info;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    //  http://localhost:8081/employee2?id=101
    @GetMapping("/employee1")
    public Employee getEmployee1(@RequestParam(name = "id") Integer id)
    {
        Employee obj=new Employee(id, "Santosh","Manager",75000);
        return  obj;
    }
//  http://localhost:8081/employee2?id=101&ename=Vinith&job=Analyst&sal=45000
    @GetMapping("/employee2")
    public Employee getEmployee2(@RequestParam(name = "id") Integer id,
                                 @RequestParam(name = "ename") String ename,
                                 @RequestParam(name = "job") String job,
                                 @RequestParam(name = "sal") Integer sal)
    {
        Employee obj=new Employee(id,ename,job,sal);
        return obj;
    }

    @GetMapping("/employee3")
    public Employee getEmployee3(@RequestParam(name = "info") String info)
    {
        Employee obj=new Employee(1001,"Santosh Gudi","santu@gmail.com",55000);
        return obj;
    }
}
