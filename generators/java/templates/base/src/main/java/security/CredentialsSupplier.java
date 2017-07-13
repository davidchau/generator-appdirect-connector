package <%=groupId%>.security;

import org.springframework.beans.factory.annotation.Value;

import com.appdirect.sdk.appmarket.Credentials;
import com.appdirect.sdk.appmarket.DeveloperSpecificAppmarketCredentialsSupplier;

public class CredentialsSupplier implements DeveloperSpecificAppmarketCredentialsSupplier {

	@Value("${connector.credentials.key}")
	private String key;
	@Value("${connector.credentials.secret}")
	private String secret;

	@Override
	public Credentials getConsumerCredentials(String isvKey) {
		return  new Credentials(key, secret);
	}
}
