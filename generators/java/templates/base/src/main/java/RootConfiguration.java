package <%=groupId%>;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.appdirect.sdk.appmarket.DeveloperSpecificAppmarketCredentialsSupplier;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.appdirect.sdk.ConnectorSdkConfiguration;
import com.appdirect.sdk.appmarket.DeveloperSpecificAppmarketCredentialsSupplier;
import com.appdirect.sdk.credentials.StringBackedCredentialsSupplier;
import <%=groupId%>.handlers.EventHandlersConfiguration;
import <%=groupId%>.security.CredentialsSupplier;

@Configuration
@Import({
		ConnectorSdkConfiguration.class,
		EventHandlersConfiguration.class
})
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {Module.class})
public class RootConfiguration {

	@Bean
	public DeveloperSpecificAppmarketCredentialsSupplier environmentCredentialsSupplier() {
		return new CredentialsSupplier();
	}
}
