package com.konduto.sdk.models;

import com.google.gson.JsonObject;
import com.konduto.sdk.exceptions.KondutoInvalidEntityException;
import com.konduto.sdk.factories.KondutoPaymentFactory;
import com.konduto.sdk.utils.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Created by rsampaio on 07/08/14.
 */
public class KondutoCreditCardPaymentTest {
	@Test
	public void serializeTest(){
		KondutoPayment creditCardPayment = KondutoPaymentFactory.getCreditCardPayment();
		JsonObject creditCardJSON = TestUtils.readJSONFromFile("credit_card.json");
		try {
			assertEquals("serialization failed", creditCardJSON, creditCardPayment.toJSON());
		} catch (KondutoInvalidEntityException e) {
			fail("credit card payment should be valid");
		}

		KondutoPayment creditCardPaymentDeserialized =
				(KondutoPayment) KondutoModel.fromJSON(creditCardJSON, KondutoCreditCardPayment.class);

		assertEquals("deserialization failed", creditCardPayment, creditCardPaymentDeserialized);
	}
}
