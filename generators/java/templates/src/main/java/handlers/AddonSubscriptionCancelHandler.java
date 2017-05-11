package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.AddonSubscriptionCancel;

public class AddonSubscriptionCancelHandler implements AppmarketEventHandler<AddonSubscriptionCancel> {
	@Override
	public APIResult handle(AddonSubscriptionCancel event) {
		// TODO: to implement

		return success("fake success message");
	}
}
