package com.NEST.NestDigitalApplication.DAO;

import com.NEST.NestDigitalApplication.Model.EmployeeRegModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRegDAO extends CrudRepository<EmployeeRegModel,Integer> {
}
