package com.konduto.sdk.exceptions;

import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rsampaio on 05/08/14.
 */
public class KondutoUnexpectedAPIResponseExceptionTest {
	@Test
	public void getMessageTest() {
		JSONObject responseBody = new JSONObject();
		KondutoUnexpectedAPIResponseException e = new KondutoUnexpectedAPIResponseException(responseBody);
		Assert.assertEquals("Unexpected API response: " + responseBody, e.getMessage());
	}
}
