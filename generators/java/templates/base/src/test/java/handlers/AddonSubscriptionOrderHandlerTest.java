package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.AddonSubscriptionOrder;
import com.appdirect.sdk.appmarket.events.EventFlag;

public class AddonSubscriptionOrderHandlerTest {
	private AddonSubscriptionOrderHandler addonSubscriptionOrderHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		addonSubscriptionOrderHandler = new AddonSubscriptionOrderHandler();
	}

	@Test
	public void dummy() throws Exception {
		AddonSubscriptionOrder event = new AddonSubscriptionOrder("consumerKey", EventFlag.DEVELOPMENT, null, null, null, "partner", "parent-accountIdentifier", null, "eventToken", "http://marketplace.url");

		APIResult result = addonSubscriptionOrderHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
		assertThat(result.getAccountIdentifier()).isNotEmpty();
	}
}
