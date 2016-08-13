import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class EstractIpAdress{
	public static void main(String[] args) {
	String result = "";
	String ipString = " OutputEC2as01 10.151.179.65 as01 OutputEC2as02 10.151.186.70 as02 ";
	
	String IPADDRESS_PATTERN = 
        "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
			
		String[] tokensStr = ipString.split(IPADDRESS_PATTERN);
		Matcher matcher;
		int indexInistr = 0;
		String tmpStr = "";
		
		for(String token : tokensStr) {
			
			indexInistr = ipString.indexOf(token);
			tmpStr = ipString.substring(indexInistr);
			
			matcher = pattern.matcher(tmpStr);
			
	        if (matcher.find()) {
				if ("".equals(result))
	            	result = result + matcher.group(0);
				else
					result = result + "," + matcher.group(0);
	        }
	   } 
	   System.out.print(result);
	}
}