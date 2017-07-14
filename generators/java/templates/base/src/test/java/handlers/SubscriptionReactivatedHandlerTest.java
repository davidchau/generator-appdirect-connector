package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionReactivated;

public class SubscriptionReactivatedHandlerTest {
	private SubscriptionReactivatedHandler subscriptionReactivatedHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionReactivatedHandler = new SubscriptionReactivatedHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionReactivated event = new SubscriptionReactivated("consumerKey", null, null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionReactivatedHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
