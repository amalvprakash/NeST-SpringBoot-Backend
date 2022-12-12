package com.NEST.NestDigitalApplication.Controller;

import com.NEST.NestDigitalApplication.DAO.EmployeeEntryDAO;
import com.NEST.NestDigitalApplication.DAO.VisitorDAO;
import com.NEST.NestDigitalApplication.Model.EmployeeEntryModel;
import com.NEST.NestDigitalApplication.Model.EmployeeRegModel;
import com.NEST.NestDigitalApplication.Model.VisitorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SecurityController {

    @Autowired
    public VisitorDAO vDAO;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/visitor", consumes = "application/json", produces = "application/json")
    HashMap<String, String> Visitor(@RequestBody VisitorModel v){
        HashMap<String, String> map = new HashMap<>();
        vDAO.save(v);
        map.put("status","success");
        return map;

    }
    @Autowired
    public EmployeeEntryDAO eDAO;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/employeeEntry", consumes = "application/json", produces = "application/json")
    HashMap<String, String> EmployeeEntry(@RequestBody EmployeeEntryModel e){
        HashMap<String, String> map = new HashMap<>();
        eDAO.save(e);
        map.put("status","success");
        return map;

    }
}
