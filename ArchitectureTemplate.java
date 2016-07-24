import java.util.*;

public class ArchitectureTemplate {
    
    
       public static List<List<String>> getTiersFromArchitectureTemplate(String architecture_template)
    {
       List<List<String>> tiers;
        tiers = new ArrayList<>();
        
            // full file name
        String[] parts = architecture_template.split("\\_"); // String array, each element is text between dots
        //String beforeFirstDot = parts[0]; 
        for (String part : parts) {
            
            List<String> single_tier;
            single_tier = new ArrayList<>();
            
            String number_str = "" + part.charAt(0) + part.charAt(1);
            //int num = Integer.parseInt(number_str);
            
            
            single_tier.add(part.substring(2));
            single_tier.add(number_str);
           // System.out.print(part.substring(2));
            tiers.add(single_tier);
        }
        return tiers;
    }
    
    
    
   
    public static void main(String[] args) {
        
        List<List<String>> tiers1;
        tiers1 = new ArrayList<>();
        tiers1 = getTiersFromArchitectureTemplate("02IIS_02WLS_01ORA");
		
        List<String> tiers2;
        tiers2 = new ArrayList<>();
		
		for(int i=0; i <  tiers1.size(); i++) {	
			
			tiers2 = tiers1.get(i);
			for(int ii = 0; ii <  tiers2.size(); ii++) {	
				System.out.println(tiers2.get(ii).toString() + "----" + ii );
			}
			
		}
	
    }
    
    
    
    
    
    
    
}
