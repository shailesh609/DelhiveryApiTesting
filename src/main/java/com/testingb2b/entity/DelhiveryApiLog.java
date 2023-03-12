package com.testingb2b.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="delhivery_api_test")
public class DelhiveryApiLog {
	@Id
	private String Id;
	
	private String requestPayload;
	private String orderId;
	private Object headers;

	public String getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(String requestPayload) {
		this.requestPayload = requestPayload;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public String getOrderId() {
		return orderId;
	}

	public Object gethrderId() {
		return headers;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
