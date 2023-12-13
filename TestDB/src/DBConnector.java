
//演習 02

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	//JDBCドライバー名を変数に代入
	private static String driverName = "com.mysql.jdbc.Driver";
	
	//MySQL用のURLを指定
	private static String url = 
			"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";

	private static String user = "root";
	private static String password = "mysql";
	
	//接続状態にする
	public Connection getConnection() {
		Connection con = null;
		
		try{
			//ドライバーがロードされ使用できる状態にする
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
			
			//クラスが見つからない場合・データベースに関する場合の例外
			} catch (ClassNotFoundException e) {
				e.printStackTrace() ;
				} catch (SQLException e) {
					e.printStackTrace() ;
					}
		return con ;
		}
}











