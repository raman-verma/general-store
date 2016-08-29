import java.sql.*;
import javax.swing.*;
public class MyConnection{
	public static Connection getConnect()throws Exception{
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://Store.mdb");
		return con;
	}
	public static void fillBrand(DefaultListModel mBrand){
		mBrand.addElement("Choose");
		mBrand.addElement("Kissan");
		mBrand.addElement("Bourbon");
		mBrand.addElement("Sunfeast");
		mBrand.addElement("Pepsi");
		mBrand.addElement("Coca-Cola");
		mBrand.addElement("Britania");
		mBrand.addElement("Nestele");
		mBrand.addElement("Detol");
		mBrand.addElement("Lux");
		mBrand.addElement("Parkevenue");
		mBrand.addElement("WildStone");
		mBrand.addElement("Haldiram");
		mBrand.addElement("MDH");
		mBrand.addElement("Hawells");
		
		mBrand.addElement("BMW");
		mBrand.addElement("Audi");
	}
	public static void fillPBrand(DefaultComboBoxModel mBrand){
		mBrand.addElement("Choose");
		mBrand.addElement("Kissan");
		mBrand.addElement("Bourbon");
		mBrand.addElement("Sunfeast");
		mBrand.addElement("Pepsi");
		mBrand.addElement("Coca-Cola");
		mBrand.addElement("Britania");
		mBrand.addElement("Nestele");
		mBrand.addElement("Detol");
		mBrand.addElement("Lux");
		mBrand.addElement("Parkevenue");
		mBrand.addElement("WildStone");
		mBrand.addElement("Haldiram");
		mBrand.addElement("MDH");
		mBrand.addElement("Hawells");
		
		mBrand.addElement("BMW");
		mBrand.addElement("Audi");
	}
}