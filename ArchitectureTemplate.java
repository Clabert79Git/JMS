import java.util.*;

public class ArchitectureTemplate {
    
    
       public static List<List<String>> getTiersFromArchitectureTemplate(String architecture_template)
    {
       List<List<String>> tiers;
        tiers = new ArrayList<>();
        
        String[] parts = architecture_template.split("\\_");
        for (String part : parts) {
            
            List<String> single_tier;
            single_tier = new ArrayList<>();
            
            String number_str = "" + part.charAt(0) + part.charAt(1);
            
            
            single_tier.add(part.substring(2));
            single_tier.add(number_str);
            tiers.add(single_tier);
        }
        return tiers;
    }
    
    
    
   
    public static void main(String[] args) {
        
        List<List<String>> nestlevel1;
        nestlevel1 = new ArrayList<>();
        nestlevel1 = getTiersFromArchitectureTemplate("01IIS_02WLS_03ORA");
		
        List<String> nestlevel2;
        nestlevel2 = new ArrayList<>();
		
		for(int i=0; i <  nestlevel1.size(); i++) {	
			
			nestlevel2 = nestlevel1.get(i);
			for(int ii = 0; ii <  nestlevel2.size(); ii++) {	
				System.out.println(nestlevel2.get(ii).toString() + "**" + i + "--"+ii);
			}
			/*
				IIS**0--0
				01**0--1
				WLS**1--0
				02**1--1
				ORA**2--0
				03**2--1
				*/
			
		}
	
    }
    
    
    
    
    
    
    
}
