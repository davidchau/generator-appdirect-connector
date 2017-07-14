package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionUpcomingInvoice;

public class SubscriptionUpcomingInvoiceHandlerTest {
	private SubscriptionUpcomingInvoiceHandler subscriptionUpcomingInvoiceHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionUpcomingInvoiceHandler = new SubscriptionUpcomingInvoiceHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionUpcomingInvoice event = new SubscriptionUpcomingInvoice("consumerKey", null, null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionUpcomingInvoiceHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
