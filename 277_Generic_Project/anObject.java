
/**
 *	An Object class that extends Measurable in order to use getMeasure()
 */
public class anObject extends Measurable<anObject> {
	double value;
/** Constructors */
	public anObject()
	{
		value = 0;
	}
	public anObject(int value)
	{
		this.value = value;
	}
/** Method utilized in Measurable Class */
	public double getMeasure()
	{
		return value;
	}
}
