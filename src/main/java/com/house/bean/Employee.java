package com.house.bean;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer empId;

    private String empName;

    private String gender;

    private String emall;

    private Integer dId;

    private Department department;

    public Employee() {
        super();
    }

    public Employee(Integer empId, String empName, String gender, String email,
                    Integer dId) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.gender = gender;
        this.emall = email;
        this.dId = dId;
    }
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getEmall() {
        return emall;
    }

    public void setEmall(String emall) {
        this.emall = emall == null ? null : emall.trim();
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public void setDepartment(Department department){
        this.department = department;
    }
    public Department getDepartment(){
        return department;
    }
}