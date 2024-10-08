
package db;

import com.sun.jdi.connect.spi.Connection;


public class MyConnection {
    private static final String username="Md.Moinul Islam";
    private static final String password="moinul";
    private static final String dataconn="dbc:mysql://localhost:3306/md.moinul islam?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static Connection con = null;
    
    public static Connection getConnection(){
      
          //  class.forName("con.mysql.cj.jdbc.Driver");
        
        return con;
        
    }
}
