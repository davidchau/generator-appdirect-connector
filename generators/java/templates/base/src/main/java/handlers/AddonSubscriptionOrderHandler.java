package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.AddonSubscriptionOrder;

public class AddonSubscriptionOrderHandler implements AppmarketEventHandler<AddonSubscriptionOrder> {
	@Override
	public APIResult handle(AddonSubscriptionOrder event) {
		// TODO: to implement

		APIResult result = success("fake success message");
		result.setAccountIdentifier("fake-account-identifier");
		return result;
	}
}
