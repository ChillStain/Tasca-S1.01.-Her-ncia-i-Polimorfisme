package N1;

public class Vehicle {
	
	
	int velocity;
	
	
	public Vehicle(){
		
		this.velocity = 0;
		
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

