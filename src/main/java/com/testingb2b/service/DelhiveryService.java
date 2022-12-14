package com.testingb2b.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingb2b.dao.DelhiveryDao;
import com.testingb2b.entity.DelhiveryApiLog;

@Service
public class DelhiveryService {

	@Autowired
	private DelhiveryDao delhiveryDao;

	public void setPayload(HttpServletRequest request, String payload, String order) {
		DelhiveryApiLog delhiveryApiLog = new DelhiveryApiLog();
		delhiveryApiLog.setOrderId(order);
		delhiveryApiLog.setRequestPayload(payload);

		delhiveryDao.save(delhiveryApiLog);
	}

}
