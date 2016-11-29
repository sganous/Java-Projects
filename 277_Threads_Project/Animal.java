/**
 * @author Sergey Ganous (012278381)
 *	@since 4/26/15
 *  CECS 277: Threads Project
 *	Animal class that implements Runnable which races other threads in its main method.
 */
public class Animal implements Runnable {
	/* Initialize Variables */
	private String name;
	private int speed;
	private int rest;
	private int priority;
	private int position = 0;
	private int lapsComplete;
	private static final int LAPS = 5;
	
	RaceStatus tracker;
	
	/* Constructor */
	public Animal(String name, RaceStatus status, int speed, int rest)
	{
		this.name = name;
		this.priority = speed;
		tracker = status;
		this.speed = speed;
		this.rest = rest;
		lapsComplete = 0;
	}
	
	/** GET AND SET METHODS **/
	//Get Name
	public String getName(){ return name; }
	//Set Position
	public void setPosition(int x){ position = x; }
	//Get Position
	public int getPosition() { return position; }
	//Set Laps complete
	public void lapComplete(){ lapsComplete++; }
	//Get Laps complete
	public int getLapComplete(){ return lapsComplete; }
	//Get Priority
	public int getPriority(){ return priority; }
	
	/* Method to compare position of thread according to the RaceStatus tracker */
	public void checkPosition()
	{
			tracker.incTracker(this);
	}

	/* Run method that runs for a given amount of laps and providing the animal's position
	 *	at each lap. */
	public void run() {
		for(int i = 0; i<LAPS; i++)
		{
			checkPosition();
			try{
				System.out.println(name+" : "+position);
				//REST
				Thread.sleep(rest);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		tracker.finnishedRace();
	}
}
