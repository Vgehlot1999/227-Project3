package lab3;

import java.util.Random;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel5
{
  // TODO - add instance variables as needed
	private int population;
	Random x = new Random();
  
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel5()
  {
    // TODO
	  population = x.nextInt(10);
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
    // TODO
	  population += x.nextInt(10);
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    // TODO
	  population = x.nextInt(10);
  }
}