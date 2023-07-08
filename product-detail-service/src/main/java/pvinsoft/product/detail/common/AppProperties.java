package pvinsoft.product.detail.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource(value = {"classpath:app.properties"})
public class AppProperties {


	@Value("${PRCE_APP_BASE_URL}")
	private String priceAppUrl;

	public String getPriceAppUrl() {
		return priceAppUrl;
	}

	public void setPriceAppUrl(String priceAppUrl) {
		this.priceAppUrl = priceAppUrl;
	}
	

	
}
