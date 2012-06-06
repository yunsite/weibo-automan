/**
 * 
 */
package weibo4j.examples.statuses;

import weibo4j.Status;
import weibo4j.Weibo;

/**
 * @author sina
 *
 */
public class UpdateStatus {

	/**
	 * 发布一条微博信息 
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("weibo4j.oauth.consumerKey", Weibo.CONSUMER_KEY);
    	System.setProperty("weibo4j.oauth.consumerSecret", Weibo.CONSUMER_SECRET);
        try {
        	Weibo weibo = new Weibo();
			//weibo.setToken(args[0],args[1]);
        	weibo.setToken("0a836ede51b0cf8b94bb1f14b2b255ae","ae74aeafa7da51c6ac213354806b63cf");
        	Status status = weibo.updateStatus("I'm back!");
        	System.out.println(status.getId() + " : "+ status.getText()+"  "+status.getCreatedAt());
        	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
