package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionClosed;

public class SubscriptionClosedHandler implements AppmarketEventHandler<SubscriptionClosed> {
	@Override
	public APIResult handle(SubscriptionClosed event) {
		// TODO: to implement

		return success("fake success message");
	}
}
