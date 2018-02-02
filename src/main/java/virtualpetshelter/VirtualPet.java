package virtualpetshelter;

public class VirtualPet {

	private String name;
	private int hunger;
	private int boredome;
	private int waste;
	private int thirst;

	public VirtualPet(String name, int hunger, int boredome, int waste, int thirst) {
		//TODO Auto-generated constructor stub
		this.name = name;
		this.hunger = hunger;
		this.boredome = boredome;
		this.waste = waste;
		this.thirst = thirst;
	
	
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public int getHunger() {
		// TODO Auto-generated method stub
		return hunger;
	}

	public void feedPet(int amountToFeed) {
		// TODO Auto-generated method stub
		hunger -= amountToFeed; 	
	}

	public void waterPet(int amountToDrink) {
		// TODO Auto-generated method stub
		thirst -= amountToDrink;
	}

	public int getWater() {
		// TODO Auto-generated method stub
		return thirst;
	}

	public void getPetStatus() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	
	
}
