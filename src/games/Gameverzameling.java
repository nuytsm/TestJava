package games;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Gameverzameling {
	
	Map<String, List<String>> spelgenres = new HashMap<String, List<String>>();

	public static void main(String[] args) {
		Gameverzameling gv = new Gameverzameling();
		
		List<String> datingsimlist = new ArrayList<String>();
		gv.spelgenres.put("datingsim", datingsimlist);
		List<String> rtslist = new ArrayList<String>();
		gv.spelgenres.put("RTS", rtslist);
		
		gv.spelgenres.get("RTS").add("Clash of clans");
		gv.spelgenres.get("RTS").add("Anno 2070");
		gv.spelgenres.get("RTS").add("Europa Universalis IV");
		
		gv.spelgenres.get("datingsim").add("KFC dating sim");
		gv.spelgenres.get("datingsim").add("huniepop");
		
//		for (int i = 0; i < gv.spelgenres.get("RTS").size(); i++) {
//			System.out.println(gv.spelgenres.get("RTS").get(i));
//		}
//		System.out.println("-------------");
//		for (int i = 0; i < gv.spelgenres.get("datingsim").size(); i++) {
//			System.out.printljn(gv.spelgenres.get("datingsim").get(i));
//		}
		
		System.out.println(gv.spelgenres.keySet());
		System.out.println(gv.spelgenres.values());
		
		System.out.println("-------------");
		gv.spelgenres.remove("datingsim");
		
		System.out.println(gv.spelgenres.keySet());
		System.out.println(gv.spelgenres.values());
		
		System.out.println(gv.spelgenres.keySet().size());
	}
	
}













