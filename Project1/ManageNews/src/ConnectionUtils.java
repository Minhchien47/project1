import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import BO.News;

public class ConnectionUtils{

	public static Connection getMyConnection() throws SQLException {
		String hostName = "localhost";
		String dbName 	= "aloalo";
		String userName = "root";
		String password = "4797";
		String connectionURL = "jdbc:mysql://" + hostName + ":3306/" + dbName;
		Connection conn = DriverManager.getConnection(connectionURL, userName, password);
		return conn;

	}
	
	
	public static void main(String[] args) {
		ArrayList<News> newlist = new ArrayList<>();
		Connection conn=null;
		try{
			conn = getMyConnection();
			String sql = "SELECT *\r\n" + 
					"FROM categories\r\n" + 
					"left JOIN news\r\n" + 
					"ON news.CategoryID = categories.CategoryID;";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);			
			System.out.println("ID			Category		Name			Description				Date			Use");
			while(rs.next()) {
				News news = new News();
				
				int ID = rs.getInt("NewID");
				String Name = rs.getString("Namenew");
				String Des = rs.getString("Description");
				Date   Date = (Date) rs.getDate("Date");
				String User = rs.getString("UserID");
				String Namecate =rs.getString("Name");
				
				news.setNewID(ID);
				news.setNamenew(Name);
				news.setDate(Date);
				
				newlist.add(news);
				
				System.out.println(ID+"			"+Namecate+"			"+Name+"			"+Des+"			"+Date+"			"+User);
			}
//			String sql1 =" Insert into News(CategoryID, Namenew, Description, Detail, Image, Date, UserID) values ('1', 'CupC2','clablaeuksas', 'abcabcbacbaaa','anhc2', '2019/05/28 10:00:00', '2');";
//			System.out.println(sql1);
//			statement.executeUpdate(sql1);
			
//			String sql3 ="Update News set detail='test' where NewID ='4'";
//			statement.executeUpdate(sql3);
			
//			String sql4 = "Update News set CategoryID ='1' where Namenew = 'Film'";
//			statement.executeUpdate(sql4);
			
//			String sql5 = "Delete From News where Namenew ='CupC2'";
//			statement.executeUpdate(sql5);
			String nameinput = "Film";
			int Cateinput = 2;
	
//			String sql6 = "Insert into News(CategoryID, Namenew, Description, Detail, Image, Date, UserID) values ('1','"+nameinput+"','clablaeuksas', 'abcabcbacbaaa','blabla', '2019/05/28 10:00:00', '2') ";
//			statement.executeUpdate(sql6);
			
//			String sql7 = "Insert into News(CategoryID, Namenew, Description, Detail, Image, Date, UserID) values (,'"+Cateinput+ nameinput+"','clablaeuksas', 'abcabcbacbaaa','blabla', '2019/05/28 10:00:00', '2') ";
//			statement.executeUpdate(sql7);
			
//			String sql8 = "Delete from News where Namenew = '"+nameinput+"';";
//			statement.executeUpdate(sql8);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Connection successfull" +conn);
	}

}
