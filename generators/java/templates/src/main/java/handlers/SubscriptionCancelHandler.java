package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionCancel;

public class SubscriptionCancelHandler implements AppmarketEventHandler<SubscriptionCancel> {
	@Override
	public APIResult handle(SubscriptionCancel event) {
		// TODO: to implement

		return success("fake success message");
	}
}
