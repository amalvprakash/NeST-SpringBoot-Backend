package com.NEST.NestDigitalApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "SecurityReg")
public class SecurityGuardModel {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String name;
    private String address;
    private Date dob;
    private String bloodGroup;
    private String phone;
    private String email;
    private String password;

    public SecurityGuardModel() {
    }

    public SecurityGuardModel(int id, int empId, String name, String address, Date dob, String bloodGroup, String phone, String email, String password) {
        this.id = id;
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.bloodGroup = bloodGroup;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
