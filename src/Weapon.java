
public class Weapon {
	public String name = "";
	public int magazineCapacity = 30;
	
	public void fire() {
		magazineCapacity = magazineCapacity -1;
		System.out.println("Weapon " + name + ", magazinecapacity: " + magazineCapacity);
	}

}
