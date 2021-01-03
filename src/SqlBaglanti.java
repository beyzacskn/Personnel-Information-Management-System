import java.sql.Connection;
import java.sql.DriverManager;
public class SqlBaglanti {
    static Connection connect=null;
    
    public static Connection baglanti()
    {
        String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String DATABASE_URL = "jdbc:sqlserver://LAPTOP-IL3BSSKB;database=PBYS;integratedSecurity=true;";
        try
        {
            Class.forName(JDBC_DRIVER);
            connect=DriverManager.getConnection(DATABASE_URL);
            return connect;
        }
        catch(Exception e)
        {
            
        }
        return null;
    }
}
