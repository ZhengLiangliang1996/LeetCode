package day38;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {
	 Map<String, String> map = new HashMap<String, String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
       String s = Integer.toHexString(longUrl.hashCode());
       map.put(s, longUrl);
       return s;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

}

//Your Codec object will be instantiated and called as such:
//Codec codec = new Codec();
//codec.decode(codec.encode(url));
