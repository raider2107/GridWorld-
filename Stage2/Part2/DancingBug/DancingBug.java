import info.gridworld.actor.Bug;
import java.util.Arrays;

public class DancingBug extends Bug 

{
	 private int[] bugTurns;
	 private int steps; // how many steps are taken

	   
	    public DancingBug(int[] bturns)
	    {
		if(bturns == null){
                bugTurns = new int[0];  
                }else {
                bugTurns = Arrays.copyOf(bturns,bturns.length);                  
                }
	       steps = 0;
	    }

	  public void turn(int times) // overloading 

	  {
		  for(int i = 0; i < times; i++)
		  {
			  turn();
		  }
	  }
	    public void act()
	    {
	        turn(bugTurns[steps%bugTurns.length]);
	        steps++;
	        super.act(); // calling a method from a superclass

	    }
}
