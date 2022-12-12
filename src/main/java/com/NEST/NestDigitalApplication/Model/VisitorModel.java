package com.NEST.NestDigitalApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitor")
public class VisitorModel {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String purpose;
    private String whom;
    private String entryTime;
    private String exitTime;

    public VisitorModel() {
    }

    public VisitorModel(int id, String name, String purpose, String whom, String entryTime, String exitTime) {
        this.id = id;
        this.name = name;
        this.purpose = purpose;
        this.whom = whom;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
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
