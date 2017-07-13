package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.failure;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.ErrorCode;
import com.appdirect.sdk.appmarket.events.UserAssignment;

public class UserAssignmentHandler implements AppmarketEventHandler<UserAssignment> {
	@Override
	public APIResult handle(UserAssignment event) {
		// TODO: to implement

		return failure(ErrorCode.OPERATION_CANCELLED, "This is not yet implemented");
	}
}
