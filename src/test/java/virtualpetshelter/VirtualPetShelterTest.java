package virtualpetshelter;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test; 
import static org.hamcrest.Matchers.is;



public class VirtualPetShelterTest {
	private static final int hunger = 50; 
	private static final int thirst = 50; 
	private static final int boredome = 30; 
	private static final int waste = 30; 
	private static final String petName = "Scrappy";
	
	private VirtualPetShelter underTest; 
	
	private VirtualPet puppy; 
	
	@Before
	public void setup() {
		//arrange
		 underTest = new VirtualPetShelter(); 
		
		 puppy = new VirtualPet(petName, hunger, boredome, waste, thirst); 
	
	}
	
	@Test
	public void virtualPetShelterShouldAddPet() {
		//arrange
		
		//act
		underTest.addPet(puppy); 		
		
		//assert
		VirtualPet retrieved = underTest.findPet(puppy);  
		assertThat(retrieved, is(underTest.findPet(puppy)));
		
	}
	
	
	@Test
	public void isAbleToAdoptPet() {
		//act
		underTest.adoptPet(puppy);
		
		//assert
		int retrieved = 0; 
		assertEquals(retrieved,underTest.shelterSize());
		//**better way to check numbers using hamcrest?**
	}
	
	@Test
	public void isAbleToFeedPet() {
		underTest.addPet(puppy);
		
		//act
		underTest.feedPetShelter(puppy.getName(),10); 
		//assert
		int check = 40;
		assertThat(check,is(puppy.getHunger()));	
		
	}
	
	@Test
	public void isAbleToWater() {
		underTest.addPet(puppy);
		
		//act
		underTest.waterPetShelter(puppy.getName(),10);
		
		//assert
		int check = 40;
		assertThat(check, is(puppy.getWater()));
		
	}
	
	@Test
	public void isAssertStatusOfPet() {
		underTest.addPet(puppy);
		
		//act
		underTest.petShelterStatus(puppy.getName());
		
		
		//assert
		VirtualPet retrieved = underTest.findPet(puppy);
		retrieved.getPetStatus();
		assertThat(retrieved.getPetStatus(),is(underTest.petShelterStatus(puppy.getName()));
		
	}
	
	
	
	
}
