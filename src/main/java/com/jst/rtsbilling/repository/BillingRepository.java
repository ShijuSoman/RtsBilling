package com.jst.rtsbilling.repository;

import com.jst.rtsbilling.model.Billing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends MongoRepository<Billing, String>{
}
