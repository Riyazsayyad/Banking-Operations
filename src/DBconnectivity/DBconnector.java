package DBconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnector {private Connection dbconnection;

public DBconnector()
{
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	dbconnection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingdb?user=root&password=Riyaz@786");
}
catch(Exception e)
{
System.out.println(e);	
}
}

public Connection getDbconnection() {
	return dbconnection;
}

}
