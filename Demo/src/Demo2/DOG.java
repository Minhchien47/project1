package Demo2;

public class DOG {
	protected String name;
	protected String color;
	protected String breed;
	
	public DOG(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	protected void wagging(String waggingAction) {
		System.out.println("wagging detail:"+ waggingAction);
	}
	protected void barking(String barkingAction) {
		System.out.println("wagging detail:"+ barkingAction);
	}
	protected void eating(String eatingAction) {
		System.out.println("wagging detail:"+ eatingAction);
	}
}