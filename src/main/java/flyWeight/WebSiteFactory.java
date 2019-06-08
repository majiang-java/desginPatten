package flyWeight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    private Map<String, ConcreteWebSite> flyWeight = new HashMap();

    public WebSite getWebSiteCategory(String key){
        if(!flyWeight.containsKey(key)) {
            flyWeight.put(key, new ConcreteWebSite(key));
        }
        return flyWeight.get(key);
    }

    public int getWeSiteCount(){
        return flyWeight.size();
    }
}
