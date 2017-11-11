package airline;
import javax.swing.*;

public class WindowUtilities 
{
	public static void setNativeLookAndFeel() 
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e)
		{
			System.out.println("Error setting native LAF: " + e);
		}
	}
//UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
//UIManager.setLookAndFeel( "com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}