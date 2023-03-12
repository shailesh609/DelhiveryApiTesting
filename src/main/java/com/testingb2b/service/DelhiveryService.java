package com.testingb2b.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingb2b.dao.DelhiveryDao;
import com.testingb2b.entity.DelhiveryApiLog;

@Service
public class DelhiveryService {

	@Autowired
	private DelhiveryDao delhiveryDao;

	public void setPayload(Map<String, String> request, String payload, String order) {
		DelhiveryApiLog delhiveryApiLog = new DelhiveryApiLog();
		delhiveryApiLog.setOrderId(order);
		delhiveryApiLog.setRequestPayload(payload);
		delhiveryApiLog.setHeaders(request);
		delhiveryDao.save(delhiveryApiLog);
	}

}
