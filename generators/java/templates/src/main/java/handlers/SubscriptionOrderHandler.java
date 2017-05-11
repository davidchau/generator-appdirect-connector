package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionOrder;

public class SubscriptionOrderHandler implements AppmarketEventHandler<SubscriptionOrder> {
	@Override
	public APIResult handle(SubscriptionOrder event) {
		// TODO: to implement

		APIResult result = success("fake success message");
		result.setAccountIdentifier("fake-account-identifier");
		return result;
	}
}
