package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionCancel;

public class SubscriptionCancelHandlerTest {
	private SubscriptionCancelHandler subscriptionCancelHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionCancelHandler = new SubscriptionCancelHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionCancel event = new SubscriptionCancel("consumerKey", "accountIdentifier", null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionCancelHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
