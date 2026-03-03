package com.gentech.demo.info;

public class Employee {
    private Integer id;
    private String ename;
    private String job;
    private Integer sal;

    public Employee(){

    }
    public Employee(Integer id, String ename, String job, Integer sal) {
        this.id = id;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }
}
