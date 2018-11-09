package nl.hanze.t12.domain;

/**
 * Interface for classes that have an engine, so it needs a fueltank
 * 
 * @author zech 
 * @version 1.0
 */
public interface HasFueltank
{
    /**
     * Drive Method
     * @param distance The distance to drive
     */
    public abstract void drive(float distance);
    
    /**
     * Method to read the fuellevel
     * @return The fuellevel
     */
    public abstract float getFuelLevel();
    
    /**
     * Method to fill the tank
     */
    public abstract void fillTank();
}
