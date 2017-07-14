package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionDeactivated;

public class SubscriptionDeactivatedHandlerTest {
	private SubscriptionDeactivatedHandler subscriptionDeactivatedHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionDeactivatedHandler = new SubscriptionDeactivatedHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionDeactivated event = new SubscriptionDeactivated("consumerKey", null, null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionDeactivatedHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
