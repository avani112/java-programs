import java.net.*;
public class HttpCon {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.youtube.com/");
			HttpURLConnection huc = (HttpURLConnection)url.openConnection();
			for(int i=0 ; i<5 ;i++) {
				System.out.println(huc.getHeaderFieldKey(i)+"="+huc.getHeaderField(i));
			}
			huc.disconnect();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
