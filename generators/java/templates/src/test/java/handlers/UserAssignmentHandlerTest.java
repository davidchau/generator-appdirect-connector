package <%= groupId %>.handlers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.MockitoAnnotations.initMocks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.EventFlag;
import com.appdirect.sdk.appmarket.events.UserAssignment;

public class UserAssignmentHandlerTest {
	private UserAssignmentHandler userAssignmentHandler;

	@BeforeMethod
	public void setup() {
		initMocks(this);
		userAssignmentHandler = new UserAssignmentHandler();
	}

	@Test
	public void dummy() throws Exception {
		UserAssignment event = new UserAssignment(null, "accountId", "consumerKey", null, EventFlag.DEVELOPMENT, "eventToken", "http://marketplace.url");

		APIResult result = userAssignmentHandler.handle(event);

		assertThat(result.isSuccess()).isFalse();
	}
}
