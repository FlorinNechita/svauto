package api.apiwrappers;

import api.CommonApiWrapper;
import api.domain.product.Content;
import api.utils.LoginUtils;
import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.message.BasicHeader;

import static helpers.Utilities.getPropertyFromAppProp;

public class ProductApiWrapper extends CommonApiWrapper {

    public Content getProducts(Content content, String page, String size) {
        String url = getPropertyFromAppProp("baseUrl");
        Header[] headers = {
                new BasicHeader("X-Violet-App-Secret", getPropertyFromAppProp("X-Violet-App-Secret"))
                , new BasicHeader("X-Violet-App-Id", getPropertyFromAppProp("X-Violet-App-Id"))
                , new BasicHeader("X-Violet-Token", LoginUtils.getToken())
                , new BasicHeader(HttpHeaders.CONTENT_TYPE, "application/json")
        };
        String endpoint = String.format("%s/catalog/products?page=%s&size=%s", url, page, size);
        return (Content) get(content, endpoint, headers);
    }
}
