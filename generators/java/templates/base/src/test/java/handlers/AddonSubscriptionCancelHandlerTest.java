package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.AddonSubscriptionCancel;
import com.appdirect.sdk.appmarket.events.EventFlag;

public class AddonSubscriptionCancelHandlerTest {
	private AddonSubscriptionCancelHandler addonSubscriptionCancelHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		addonSubscriptionCancelHandler = new AddonSubscriptionCancelHandler();
	}

	@Test
	public void dummy() throws Exception {
		AddonSubscriptionCancel event = new AddonSubscriptionCancel("accountIdentifier", "parent-accountIdentifier", "consumerKey", null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = addonSubscriptionCancelHandler.handle(event);

		assertThat(result.isSuccess()).isTrue();
	}
}
