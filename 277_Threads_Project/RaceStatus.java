import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Sergey Ganous (012278381)
 *	@since 4/26/15
 *	CECS 277: Threads Project
 *	RaceStatus method which contains a static tracker variable for all of the animal threads
 *	to access and manipulate in order to determine their position in the race.
 */
public class RaceStatus {
	/* Initialize Variables */

	int index;
	public static int racerCount;
	private Lock positionChangeLock;
	Animal racers[];

	/* Constructor */
	public RaceStatus()
	{
		racerCount = 1;
		positionChangeLock = new ReentrantLock();
	}
	
	
	public void setRacers(Animal racers[])
	{
		this.racers = racers;
	}
	/** Method to tally the positions of the racing threads 
	 ** Index sets the position of the thread that accessed this method.
	 **/
	@SuppressWarnings("finally")
	public void incTracker(Animal aRacer){
		positionChangeLock.lock();
		try
		{
			index = 1;
			for(int i = 0; i<racers.length; i++)
			{
				if(racers[i].getLapComplete() > aRacer.getLapComplete())
				{
					index++;
				}
			}
			aRacer.lapComplete();
			aRacer.setPosition(index);
		}
		finally
		{
		positionChangeLock.unlock();
		}
	}
	
	/* Method to indicate that a player has finished the race */
	public void finnishedRace(){
		positionChangeLock.lock();
		try{
			racerCount++;
		}
		finally
		{
		positionChangeLock.unlock();
		}
	}
}
