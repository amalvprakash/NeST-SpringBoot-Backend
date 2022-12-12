package com.NEST.NestDigitalApplication.DAO;

import com.NEST.NestDigitalApplication.Model.VisitorModel;
import org.springframework.data.repository.CrudRepository;

public interface VisitorDAO extends CrudRepository<VisitorModel, Integer> {
}
