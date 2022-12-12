package com.NEST.NestDigitalApplication.Controller;

import com.NEST.NestDigitalApplication.DAO.EmployeeRegDAO;
import com.NEST.NestDigitalApplication.DAO.SecurityGuardDAO;
import com.NEST.NestDigitalApplication.Model.EmployeeRegModel;
import com.NEST.NestDigitalApplication.Model.SecurityGuardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class AdminController {
    @Autowired
    public EmployeeRegDAO eDAO;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeReg", consumes = "application/json", produces = "application/json")
    HashMap<String, String> EmployeeReg(@RequestBody EmployeeRegModel e){
        HashMap<String, String> map = new HashMap<>();
        eDAO.save(e);
        map.put("status","success");
        return map;

    }

    @Autowired
    public SecurityGuardDAO sDAO;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityReg", consumes = "application/json", produces = "application/json")
    HashMap<String, String> SecurityReg(@RequestBody SecurityGuardModel s){
        HashMap<String, String> map = new HashMap<>();
        sDAO.save(s);
        map.put("status","success");
        return map;

    }

}
