package com.NEST.NestDigitalApplication.Controller;

import com.NEST.NestDigitalApplication.DAO.EmployeeEntryDAO;
import com.NEST.NestDigitalApplication.DAO.LeaveApplyDAO;
import com.NEST.NestDigitalApplication.Model.EmployeeEntryModel;
import com.NEST.NestDigitalApplication.Model.LeaveApplyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class EmployeeController {
    @Autowired
    public LeaveApplyDAO lDAO;

    @Autowired
    public EmployeeEntryDAO eDAO;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leaveApply", consumes = "application/json", produces = "application/json")
    HashMap<String, String> LeaveApply(@RequestBody LeaveApplyModel l){
        HashMap<String, String> map = new HashMap<>();
        lDAO.save(l);
        map.put("status","success");
        return map;

    }
}
