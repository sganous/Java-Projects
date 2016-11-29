/**
 * @author Sergey Ganous (012278381)
 *	@since 4/26/15
 *	CECS 277: Threads Project
 *	Main method to custruct and start the race
 */
public class MainRace {
	/* Main method to race the animal objects */
	public static void main(String[] args)
	{
		//INITIALIZE VARIABLES
		RaceStatus tracker = new RaceStatus();
		Animal[] animals = new Animal[3];
		animals[0] = new Animal("Tiger", tracker, 1, 1000);
		animals[1] = new Animal("Cow", tracker, 1, 1000);
		animals[2] = new Animal("Chicken", tracker, 1, 1000);
		Thread[] threads = new Thread[3];
		tracker.setRacers(animals);
		//Initialize and start the threads
		for(int i = 0; i < animals.length; i++)
		{
			threads[i] = new Thread(animals[i]);
			threads[i].setPriority(animals[i].getPriority());
			threads[i].start();
		}
		//Check to see when threads are finished
		while(threads[0].isAlive() || threads[1].isAlive() || threads[2].isAlive()){}
		//Print Results
		System.out.println("\n RESULTS \n");
		for(int i = 0; i<animals.length; i++)
		{
			System.out.println(animals[i].getName()+" came in "+animals[i].getPosition());
		}
		
	}
}
