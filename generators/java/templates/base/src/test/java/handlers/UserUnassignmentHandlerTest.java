package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.UserUnassignment;

public class UserUnassignmentHandlerTest {
	private UserUnassignmentHandler userUnassignmentHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		userUnassignmentHandler = new UserUnassignmentHandler();
	}

	@Test
	public void dummy() throws Exception {
		UserUnassignment event = new UserUnassignment(null, "accountId", "consumerKey", null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = userUnassignmentHandler.handle(event);

		assertThat(result.isSuccess()).isFalse();
	}
}
