package airline;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//import javax.swing.text.*;
@SuppressWarnings("empty-statement")
public class LoginPage extends JFrame
{
	/**
	 * 
	 */
    
	JButton BSignUp;
	Container c = getContentPane();
	JPanel FlightDetailsPanel = new JPanel(null);
	JPanel FlightTypesPanel = new JPanel(null);
	JPanel LoginPanel = new JPanel(null);

        int width = getWidth();
        int height = getHeight();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width - width) / 2;
        int y = (screen.height - height) / 2;
    
	public boolean Check=true;

	JLabel DomesticFlight_Label = new JLabel("<html><B>Domestic Flights</B></html>");
	JLabel InternationalFlight_Label = new JLabel("<html><B>International Flights</B></html>");

	JLabel UserName_Label, Password_Label,User_Label;

	JLabel DomesticFlight_Label1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
	JLabel InternationalFlight_Label1 = new JLabel("<html><B>International Flight Booking</B></html>");

	JTextField TFUserName;
	JPasswordField PFPassword;

	JButton BLogin;
                //BSignUp;

	final Object[] col1 ={ "From", "To", "Price", "Time" };
	final Object[] col2 = { "From", "To", "Price", "Time" };
	final Object[] col3 = { "From", "To", "Price", "Time" };
  
            
	final Object[][] row1 ={ { "Jaipur", "Bangalore", "3125", "16:30" }, { "Jaipur", "Chennai ", "3225", "19:00" }, { "Jaipur", "Delhi", "1425 ", "08:30" }, { "Jaipur", "Goa", "1025 ", "09:50" }, { "Jaipur", "Hyderabad", "1525", "11:00" }, { "Jaipur", "Kolkata", "3825 ", "05:30" }, { "Jaipur", "Lucknow", "3025 ", "05:30" }, { "Jaipur", "Mumbai", "1725", "12:00" }, { "Jaipur", "Vishakapatnam", "3725", "19:00" } };
	final Object[][] row2 = { { "Jaipur", "Bali", "21485", "06:20" }, { "Jaipur", "Bangkok", "9000", "20:45" }, { "Jaipur", "Cairo", "22975", "10:25" }, { "Jaipur", "CapeTown", "42500", "16:45" }, { "Jaipur", "Chicago", "35000", "06:30" }, { "Jaipur", "Dubai", "12000", "08:15" }, { "Jaipur", "Frankfurt", "18500", "06:50" }, { "Jaipur", "HongKong", "20845", "12:00" }, { "Jaipur", "Istanbul", "22000", "10:45" }, { "Jaipur", "London", "22600", "14:35" }, { "Jaipur", "LosAngeles", "35000", "22:00" }, { "Jaipur", "Melbourne", "27800", "21:15" }, { "Jaipur", "New York", "32000", "08:50" }, { "Jaipur", "Paris", "18500", "18:45" }, { "Jaipur", "Rome", "19900", "20:00"}, { "Jaipur", "SanFrancisco", "35000", "12:00"}, { "Jaipur", "shanghai", "24430", "10:15" }, { "Jaipur", "Singapore", "9000", "21:10" }, { "Jaipur", "Sydney", "27800", "12:00"}, { "Jaipur", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "Jaipur", "Bangalore", "9375", "16:30" }, { "Jaipur", "Chennai ", "9675", "19:00" }, { "Jaipur", "Delhi", "4275", "08:30" }, { "Jaipur", "Goa", "3075", "09:50" }, { "Jaipur", "Hyderabad", "4575", "11:00" }, { "Jaipur", "Kolkata", "11475", "05:30" }, { "Jaipur", "Lucknow", "9075", "05:30" }, { "Jaipur", "Mumbai", "5175", "12:00" }, { "Jaipur", "Vishakapatnam", "11175", "19:00" } };
	final Object[][] row4 = { { "Jaipur", "Bali", "64455", "06:20" }, { "Jaipur", "Bangkok", "27000", "20:45" }, { "Jaipur", "Cairo", "68925", "10:25" }, { "Jaipur", "CapeTown", "37500", "16:45" }, { "Jaipur", "Chicago", "105000", "06:30" }, { "Jaipur", "Dubai", "36000", "08:15" }, { "Jaipur", "Frankfurt", "55500", "06:50" }, { "Jaipur", "HongKong", "62535", "12:00" }, { "Jaipur", "Istanbul", "66000", "10:45" }, { "Jaipur", "London", "67800", "14:35" }, { "Jaipur", "LosAngeles", "105000", "22:00" }, { "Jaipur", "Melbourne", "83400", "21:15" }, { "Jaipur", "New York", "96000", "08:50" }, { "Jaipur", "Paris", "55500", "18:45" }, { "Jaipur", "Rome", "59700", "20:00" }, { "Jaipur", "SanFrancisco", "105000", "12:00" }, { "Jaipur", "shanghai", "73290", "10:15" }, { "Jaipur", "Singapore", "27000", "21:10"}, { "Jaipur", "Sydney", "83400", "12:00"}, { "Jaipur", "Toronto", "105000", "17:00" } };

	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col2);
	JTable TDomesticFlight1 = new JTable(row3, col3);
	JTable TInternationalFlight1 = new JTable(row4, col2);
        
        
	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	Icon img1 = new ImageIcon("img/economic.jpg");
	Icon img2 = new ImageIcon("img/business.jpg");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.jpg");

	JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);

	public LoginPage()
	{
		TDomesticFlight.setEnabled(false);
                TDomesticFlight1.setEnabled(false);
                TInternationalFlight.setEnabled(false);
                TInternationalFlight1.setEnabled(false);
                setTitle("Airline Reservation System");
                WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));
		this.setResizable(false);
		FlightTypesPanel.setBackground(Color.white);
		LoginPanel.setBackground(Color.white);
                
		//this.setLocationRelativeTo(null);
                
		FlightDetailsPanel.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);
                

		FlightTypesPanel.setBounds(0,0,500, 340);
		LoginPanel.setBounds(500,0,350, 340);
		FlightDetailsPanel.setBounds(0,340,790,200);


		UserName_Label = new JLabel("         User Name ");
		Password_Label = new JLabel("         Password ");
                User_Label=new JLabel("Welcome Guest!");
		TFUserName = new JTextField(10);
		PFPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");
                BSignUp = new JButton("Sign Up");

		UserName_Label.setBounds(40, 100, 100, 21);
		Password_Label.setBounds(40, 140, 100, 21);
                User_Label.setBounds(40, 20, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		PFPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);
                BSignUp.setBounds(160, 230, 100, 25);
                
                
		DomesticFlight_Label1.setBounds(60, 60, 138, 20);
		InternationalFlight_Label1.setBounds(60, 100, 153, 20);

		LoginPanel.add(UserName_Label);
		LoginPanel.add(TFUserName);
		LoginPanel.add(Password_Label);
                LoginPanel.add(User_Label);
		LoginPanel.add(PFPassword);
		LoginPanel.add(BLogin);
                LoginPanel.add(BSignUp);
                //this.setEditable(false); 
               
		FlightDetailsPanel.add(JSP1);
		FlightDetailsPanel.add(JSP2);
		FlightDetailsPanel.add(JSP3);
		FlightDetailsPanel.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);

		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);

		FlightTypesPanel.add(LEconomic);
		FlightTypesPanel.add(LBusiness);
		FlightTypesPanel.add(LEconomic1);
		FlightTypesPanel.add(LBusiness1);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);


		DomesticFlight_Label.setBounds(60, 60, 100, 25);
		InternationalFlight_Label.setBounds(60, 100, 120, 25);

		c.add(FlightTypesPanel);
		c.add(LoginPanel);
		c.add(FlightDetailsPanel);

		FlightTypesPanel.add(DomesticFlight_Label);
		FlightTypesPanel.add(InternationalFlight_Label);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		DomesticFlight_Label.addMouseListener(new mouse1(this, true));
		InternationalFlight_Label.addMouseListener(new mouse1(this, false));

		DomesticFlight_Label1.addMouseListener(new mouse3(this, true));
		InternationalFlight_Label1.addMouseListener(new mouse3(this, false));

		LBusiness1.addMouseListener(new mouse2(this, true));
		LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
                BSignUp.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
            LoginPage loginPage = new LoginPage();
	}
}
class button1 implements ActionListener
{
	LoginPage type;
	JFrame f;
        String user,pass;

	public button1(LoginPage type)
	{
		this.type = type;
	}
        @Override
	public void actionPerformed(ActionEvent e)
	{
            String cmd = e.getActionCommand();
            if(cmd.equals("Sign In"))
            {
                String dbuser,dbpass;
                String LoginUser=null,LoginPass=null;
                user = type.TFUserName.getText();
                pass=type.PFPassword.getText();
                //System.err.println(user);
                //System.err.println(pass);
                Connection conn=null;
                Statement stmt=null;
                ResultSet rs=null; 
                try 
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    try {
                        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","");
                    } catch (SQLException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        stmt=conn.createStatement();
                    } catch (SQLException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        rs=stmt.executeQuery("select * from user");
                    } catch (SQLException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                    while(rs.next())
                    {
                        dbuser=rs.getString("username");
                        dbpass=rs.getString("pass");
                        //System.err.println(user);
                        //System.err.println(pass);
                        if(user.equals(dbuser) && pass.equals(dbpass))
                        {
                            LoginUser=dbuser;
                            LoginPass=dbpass;
                        }   
                        //System.err.println(LoginUser);
                        //System.err.println(LoginPass);
                    }
                    if(user.equals("") || pass.equals(""))
                    {
                        JOptionPane.showMessageDialog(null, "Enter username or password");
                    }
                    else
                    if(user.equals(LoginUser) && pass.equals(LoginPass))
                    {
                        type.LoginPanel.add(type.DomesticFlight_Label1);
                        type.LoginPanel.add(type.InternationalFlight_Label1);
                            
                        //type.LoginPanel.remove(type.User_Label);
                        if(user.equals("admin"))
                        {
                            type.User_Label.setText("Welcome admin!"); 
                        }
                        else
                        {
                            type.User_Label.setText("Welcome "+user+"!");
                        }
                            
                        type.LoginPanel.remove(type.UserName_Label);
                        type.LoginPanel.remove(type.TFUserName);
                        type.LoginPanel.remove(type.Password_Label);
                        type.LoginPanel.remove(type.PFPassword);
                        type.LoginPanel.remove(type.BLogin);
                        type.LoginPanel.remove(type.BSignUp);
                        type.c.repaint();
                        
                      }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
                        }

                    } catch (SQLException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    try 
                    {
                        rs.close();
                        stmt.close();
                    } catch (SQLException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                  }//end of if(cmd.equals("Sign In"))
                    if(cmd.equals("Sign Up"))
                    {
                        type.setVisible(false);
                        new SignUp().setVisible(true);
                    }
                   
        }
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean Check;

	public mouse1(LoginPage type, boolean Check)
	{
		this.type = type;
		this.Check = Check;
	}
        @Override
	public void mouseEntered(MouseEvent e)
	{
		type.DomesticFlight_Label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.InternationalFlight_Label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
        @Override
	public void mouseClicked(MouseEvent e)
	{
		if(Check)
		type.Check = true;
		else
		type.Check = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(Check)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean Check;

	public mouse3(LoginPage type, boolean Check)
	{
		this.type = type;
		this.Check = Check;
	}
        @Override
	public void mouseEntered(MouseEvent e)
	{
		type.DomesticFlight_Label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.InternationalFlight_Label1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
        @Override
	public void mouseClicked(MouseEvent e)
	{
		if(Check)
		new DomesticFlight(type);
		else
		new InternationalFlight(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean Check;

	public mouse2(LoginPage type, boolean Check)
	{
		this.type = type;
		this.Check = Check;
	}
        @Override
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
        @Override
	public void mouseClicked(MouseEvent e)
	{
		if(type.Check)
		{
			if (Check)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (Check)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}