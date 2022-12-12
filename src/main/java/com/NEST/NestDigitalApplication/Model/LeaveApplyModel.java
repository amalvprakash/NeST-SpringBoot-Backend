package com.NEST.NestDigitalApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaveApply")
public class LeaveApplyModel {
    @Id
    @GeneratedValue
    private int id;
    private int empId;
    private String leaveFrom;
    private String leaveTo;
    private String reason;
    private String catagory;
    private String status;

    public LeaveApplyModel() {
    }

    public LeaveApplyModel(int id, int empId, String leaveFrom, String leaveTo, String reason, String catagory, String status) {
        this.id = id;
        this.empId = empId;
        this.leaveFrom = leaveFrom;
        this.leaveTo = leaveTo;
        this.reason = reason;
        this.catagory = catagory;
        this.status = status;
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

    public String getLeaveFrom() {
        return leaveFrom;
    }

    public void setLeaveFrom(String leaveFrom) {
        this.leaveFrom = leaveFrom;
    }

    public String getLeaveTo() {
        return leaveTo;
    }

    public void setLeaveTo(String leaveTo) {
        this.leaveTo = leaveTo;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
