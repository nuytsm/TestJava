package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ikea {
	
//	String[] aankopen = new String[50];
	
	List<String> aankopen = new ArrayList<String>();
	
	public static void main(String[] args) {
		Ikea ikea = new Ikea();
		ikea.addToAankopen("stoel");
		ikea.addToAankopen("deurknop");
		ikea.addToAankopen("sofa");
		ikea.addToAankopen("sofa");
		ikea.addToAankopen("gehaktballen");
		
		System.out.println(ikea.aankopen.size());
		System.out.println(ikea.aankopen);
//		ikea.aankopen.clear();
//		System.out.println(ikea.aankopen);
//		System.out.println(ikea.aankopen.size());
		
		for (int i = 0; i < ikea.aankopen.size(); i++) {
			String aankoopstring = ikea.aankopen.get(i);
			System.out.println(aankoopstring + " --item:" + i);
		}
		for (String ksdjfls : ikea.aankopen) {
			System.out.println(ksdjfls + "****");
		}
//		System.out.println(ikea.aankopen.get(2));
//		System.out.println(ikea.aankopen.get(ikea.aankopen.size()-1));
		
	}
	
	public void addToAankopen(String aankoop) {
			this.aankopen.add(aankoop);						
	}

}
