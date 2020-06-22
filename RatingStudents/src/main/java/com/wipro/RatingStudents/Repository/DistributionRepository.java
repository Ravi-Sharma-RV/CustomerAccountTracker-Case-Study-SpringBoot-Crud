package com.wipro.RatingStudents.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wipro.RatingStudents.Model.DistributionBean;

@Repository
public interface DistributionRepository extends CrudRepository<DistributionBean, Integer> {

}
