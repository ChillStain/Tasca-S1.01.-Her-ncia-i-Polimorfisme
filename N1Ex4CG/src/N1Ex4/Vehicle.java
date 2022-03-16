package N1Ex4;

public class Vehicle {
	
	private static int totKm;
	private final int maxSpeed;
	private static final int numReg = 01;
	
	int velocity;
	
	
	
	public Vehicle(final int maxSpeed, int totKm){
		this.maxSpeed = maxSpeed;
		this.totKm = totKm;
		this.velocity = 0;
		System.out.println("This vehicle have a maximum speed of " + maxSpeed + " Km/h and already have made a total of "+totKm+" Km. The registration number is "+ numReg);
		
	}
	
	public int getVelocity(){
        return velocity;
    }
	
	public void speedUp(){
        this.velocity += 5;
        System.out.println(this.velocity);
        

}

	public void start() {
		System.out.println("Start");
		
	}


	public static void stop() {
		System.out.println("Stop");
		
	}

	

	
}

