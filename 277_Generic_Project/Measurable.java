/**
 *  Sergey Ganous(012278381)
 *  3/8/16
 *  CECS 277 Generic Class Project
 *  Describes any class whose objects can be measured.
*/
import java.util.*;
public abstract class Measurable<T> implements Comparable<Measurable>
{
	/** Abstract method to get a measurable value */
	public abstract double getMeasure();
	
	/** Static method in order to return the largest Object in an array list 
	 * 	@param objects	Array list of T objects 
	 * 	@return largest The T object with the largest getMeasure value
	 */ 
	public static <T extends Measurable> T max(ArrayList<T> objects)
	{	  
		T largest = objects.get(0);
		for(int i = 1; i<objects.size(); i++)
		{
			T obj = objects.get(i);
			if(largest.getMeasure() < obj.getMeasure())
			{
				largest = obj;
			}
		}		
	  return largest;
	}
	
	/**
	 * CompareTo method in order to be able to sort the ArrayList
	 * @param obj	T object to be compared to.
	 * @return Returns -1, 0, or 1 according to calculations
	 */
	public int compareTo(Measurable obj)
	{
		if(this.getMeasure() < (obj).getMeasure()){return -1;}
		else if(this.getMeasure() > (obj).getMeasure()){return 1;}
		else{return 0;}
	}
}