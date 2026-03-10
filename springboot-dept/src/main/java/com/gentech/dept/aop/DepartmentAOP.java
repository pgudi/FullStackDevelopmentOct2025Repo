package com.gentech.dept.aop;

import com.gentech.dept.entity.Department;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Date;

@Aspect
@Component
public class DepartmentAOP {

    @Before(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint)
    {
        System.out.println("the Execution of "+joinPoint.getSignature()+" has started "+new Date());
    }

    @After(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
    public void afterAdvice(JoinPoint joinPoint)
    {
        System.out.println("the Execution of "+joinPoint.getSignature()+" has ended "+new Date());
    }

    @Before(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void beforeAdviceDeptService(JoinPoint joinPoint)
    {
        System.out.println("the Execution of "+joinPoint.getSignature()+" has started "+new Date());
    }

    @After(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
    public void afterAdviceDeptService(JoinPoint joinPoint)
    {
        System.out.println("the Execution of "+joinPoint.getSignature()+" has ended "+new Date());
    }

    @AfterReturning(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.createDepartment(..))", returning = "department")
    public void afterAdviceDeptServiceReturning(JoinPoint joinPoint, Department department)
    {
        System.out.println("The Execution of "+joinPoint.getSignature()+" has provided department Object with id "+department.getId());
        System.out.println("The Execution of "+joinPoint.getSignature()+" has provided department Object with Department Name "+department.getDeptName());
    }

    @AfterThrowing(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.createDepartment(..))", throwing = "exception")
    public void afterAdviceDeptServiceThrowing(JoinPoint joinPoint, Exception exception)
    {
        System.out.println("During the Execution of "+joinPoint.getSignature()+" the Exception has occured with Exception details "+exception.getMessage());
    }
}
