package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionChange;

public class SubscriptionChangeHandlerTest {
	private SubscriptionChangeHandler subscriptionChangeHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionChangeHandler = new SubscriptionChangeHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionChange event = new SubscriptionChange("consumerKey", null, null, null, null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionChangeHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
