package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.SubscriptionOrder;

public class SubscriptionOrderHandlerTest {
	private SubscriptionOrderHandler subscriptionOrderHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		subscriptionOrderHandler = new SubscriptionOrderHandler();
	}

	@Test
	public void dummy() throws Exception {
		SubscriptionOrder event = new SubscriptionOrder("consumerKey", EventFlag.DEVELOPMENT, null, null, null, null, "partner", "applicationUuid", null, "eventToken", "http://marketplace.url");

		APIResult result = subscriptionOrderHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
		assertThat(result.getAccountIdentifier()).isNotEmpty();
	}
}
