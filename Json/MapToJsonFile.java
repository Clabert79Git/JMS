import java.util.*;
import org.json.simple;

public class MapToJsonFile {
	
	public static void main(String[] args) {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put( "name", "Mars" );
		data.put( "age", 32 );
		data.put( "city", "NY" );
		JSONObject json = new JSONObject();
		json.putAll( data );
		System.out.printf( "JSON: %s", json.toString(2) );
	}
}