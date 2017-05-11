package <%= groupId %>.handlers;

import static com.appdirect.sdk.appmarket.events.APIResult.success;

import com.appdirect.sdk.appmarket.AppmarketEventHandler;
import com.appdirect.sdk.appmarket.events.APIResult;
import com.appdirect.sdk.appmarket.events.SubscriptionUpcomingInvoice;

public class SubscriptionUpcomingInvoiceHandler implements AppmarketEventHandler<SubscriptionUpcomingInvoice> {
	@Override
	public APIResult handle(SubscriptionUpcomingInvoice event) {
		// TODO: to implement

		return success("fake success message");
	}
}
