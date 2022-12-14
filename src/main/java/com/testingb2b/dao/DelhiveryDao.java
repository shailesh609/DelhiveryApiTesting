package com.testingb2b.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testingb2b.entity.DelhiveryApiLog;


public interface DelhiveryDao extends MongoRepository<DelhiveryApiLog, String> {

}
