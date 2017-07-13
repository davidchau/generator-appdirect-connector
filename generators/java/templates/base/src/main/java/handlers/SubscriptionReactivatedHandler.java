package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionReactivated;

public class SubscriptionReactivatedHandler implements AppmarketEventHandler<SubscriptionReactivated> {
	@Override
	public APIResult handle(SubscriptionReactivated event) {
		// TODO: to implement

		return success("fake success message");
	}
}
