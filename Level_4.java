import greenfoot.*;

public class Level_4 extends Actor
{
    public Level_4()
    {
        //
    }
    
    public void act()
    {
        if (Greenfoot.mouseMoved(null))
        {
            // Remove the object once the cursor/mouse moves
            getWorld().removeObject(this);
        }
    }
}