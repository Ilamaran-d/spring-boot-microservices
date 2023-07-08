package pvinsoft.product.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource(value = {"classpath:app.properties"})
public class AppProperties {

	@Value("${CTGRY_APP_BASE_URL}")
    private String categoryAppUrl;

	@Value("${DETL_APP_BASE_URL}")
	private String detailAppUrl;
	
	@Value("${PRCE_APP_BASE_URL}")
	private String priceAppUrl;
	
	public String getDetailAppUrl() {
		return detailAppUrl;
	}

	public void setDetailAppUrl(String detailAppUrl) {
		this.detailAppUrl = detailAppUrl;
	}

	public String getCategoryAppUrl() {
		return categoryAppUrl;
	}

	public void setCategoryAppUrl(String categoryAppUrl) {
		this.categoryAppUrl = categoryAppUrl;
	}

	public String getPriceAppUrl() {
		return priceAppUrl;
	}

	public void setPriceAppUrl(String priceAppUrl) {
		this.priceAppUrl = priceAppUrl;
	}
}
