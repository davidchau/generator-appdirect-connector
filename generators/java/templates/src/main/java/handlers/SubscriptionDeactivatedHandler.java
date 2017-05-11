package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionDeactivated;

public class SubscriptionDeactivatedHandler implements AppmarketEventHandler<SubscriptionDeactivated> {
	@Override
	public APIResult handle(SubscriptionDeactivated event) {
		// TODO: to implement

		return success("fake success message");
	}
}
