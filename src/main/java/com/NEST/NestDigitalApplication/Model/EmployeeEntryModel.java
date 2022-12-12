package com.NEST.NestDigitalApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeEntry")
public class EmployeeEntryModel {

    @Id
    @GeneratedValue
    private int id;
    private int empid;
    private String entryTime;
    private String exitTime;

    public EmployeeEntryModel() {
    }

    public EmployeeEntryModel(int id, int empid, String entryTime, String exitTime) {
        this.id = id;
        this.empid = empid;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }
}
