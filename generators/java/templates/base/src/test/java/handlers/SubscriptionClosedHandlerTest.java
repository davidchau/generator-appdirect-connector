package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionClosed;

public class SubscriptionClosedHandlerTest {
	private SubscriptionClosedHandler subscriptionClosedHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionClosedHandler = new SubscriptionClosedHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionClosed event = new SubscriptionClosed("consumerKey", null, null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionClosedHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
