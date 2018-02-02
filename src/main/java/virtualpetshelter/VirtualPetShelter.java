package virtualpetshelter;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String,VirtualPet> virtualPets = new HashMap<String,VirtualPet>(); 
		
	public void addPet(VirtualPet pet) {
		virtualPets.put(pet.getName(),pet);
		
	}

	public VirtualPet findPet(VirtualPet pet) {
		// TODO Auto-generated method stub
		return virtualPets.get(pet.getName());
	}

	public void adoptPet(VirtualPet pet) {
		// TODO Auto-generated method stub
		virtualPets.remove((pet).getName()); 
	}

	public int shelterSize() {
		// TODO Auto-generated method stub
		return virtualPets.size();
	}

	public void feedPetShelter(String name, int amountToFeed) {
		// TODO Auto-generated method stub
		VirtualPet petObject = virtualPets.get(name);
		petObject.feedPet(amountToFeed);
	}

	public void waterPetShelter(String name, int amountToDrink) {
		// TODO Auto-generated method stub
		VirtualPet petObject = virtualPets.get(name);
		petObject.waterPet(amountToDrink); 
		
	}

	public void petShelterStatus(String name) {
		// TODO Auto-generated method stub
		VirtualPet petObject = virtualPets.get(name); 
		petObject.getPetStatus(); 
	}
	
	
	
}
