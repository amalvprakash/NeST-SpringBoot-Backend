package com.NEST.NestDigitalApplication.DAO;

import com.NEST.NestDigitalApplication.Model.EmployeeEntryModel;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeEntryDAO extends CrudRepository<EmployeeEntryModel, Integer> {
}
