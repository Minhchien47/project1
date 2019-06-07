import Utils.ConnectionUtilsNews;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import BO.News;


public  class NewsDAO extends ConnectionUtilsNews implements INews {

	public  Scanner scanner =  new Scanner(System.in);
	public static int inputNumber = 0;

	@Override
	public void addNews() {
		Connection conn = null;
		
		try{
			conn = getMyConnection();
			Statement stt = conn.createStatement();
//				System.out.println("Nhap IDNew: ");
//				int newid = scanner.nextInt();
				System.out.println("Nhap IDCatogory: ");
				int categoryid = scanner.nextInt();
				System.out.println("Nhap Name: ");
				String namenew = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Nhap Description: ");
				String des = scanner.nextLine();
				System.out.println("Nhap Detail: ");
				String detail = scanner.nextLine();
				System.out.println("Nhap Date: ");
				String date = scanner.nextLine();
				System.out.println("Nhap Image: ");
				String img = scanner.nextLine();
				System.out.println("Nhap UserID: ");
				int userid = scanner.nextInt();
				
				String sqladd = "insert into News(CategoryID, Namenew, Description, Detail, Date, Image, UserID) values"
						+ " ("+"'"+categoryid +"','"+namenew+"','"+des+"','"+detail+"','"+date+"','"+img+"','"+userid+"'"+")";
				stt.execute(sqladd);
						
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void showNews() {
		Connection conn = null;

		try {
				conn = getMyConnection();
				Statement stt = conn.createStatement();
				String sqlshow = "Select * From News";
				ResultSet rs = stt.executeQuery(sqlshow);	
				System.out.println("ID				CategoryID				Name				Description					Detail				Date	 		Image			UserID");

				while(rs.next()) {
					int newid = rs.getInt("NewID");
					int catid = rs.getInt("CategoryID");
					String namenew = rs.getString("Namenew");
					String Des = rs.getString("Description");
					String Detail = rs.getString("Detail");
					Date   Date = (Date) rs.getDate("Date");
					String img = rs.getString("Image");
					String User = rs.getString("UserID");
					
					System.out.println(newid+"				"+catid+"				"+namenew+"					"+Des+"					"+Detail+"					"+img+"					"+Date+"			"+User);

				}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void editNews() {
			Connection conn = null;

			try {
					conn = getMyConnection();
					Statement stt = conn.createStatement();
					
						System.out.println("Nhap IDNew: ");
						int newid = scanner.nextInt();
						System.out.println("Nhap IDCatogory: ");
						int categoryid = scanner.nextInt();
						System.out.println("Nhap Name: ");
						String namenew = scanner.nextLine();
						scanner.nextLine();
						System.out.println("Nhap Description: ");
						String des = scanner.nextLine();
						System.out.println("Nhap Detail: ");
						String detail = scanner.nextLine();
						System.out.println("Nhap Date: ");
						String date = scanner.nextLine();
						System.out.println("Nhap Image: ");
						String img = scanner.nextLine();
						System.out.println("Nhap UserID: ");
						int userid = scanner.nextInt();
						
						String sqledit = "Update News Set " + "CategoryID ="+"'"+categoryid+"',"+"Namenew ="+"'"+namenew+"',"
										+"Description ="+"'"+des+"',"+"Detail ="+"'"+detail+"',"+"Image ="+"'"+img+"',"+"Date ="
										+"'"+date+"',"+"UserID ="+"'"+userid+"'" +"Where NewID ="+"'"+newid+"'";			
						stt.execute(sqledit);
			}catch(Exception e) {
				e.printStackTrace();
			}
		
	}

	@Override
	public void deleteNews() {
		Connection conn = null;

		try {
				conn = getMyConnection();
				Statement stt = conn.createStatement();
				System.out.println("Nhap vao ten bai viet muon xoa: ");
				String namedel = scanner.nextLine();
				String sqldel = "Delete from News where Namenew= "+"'"+namedel+"'";
				stt.execute(sqldel);
				System.out.println("Da xoa thanh cong");
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void findNews() {
		Connection conn = null;

		try {				
				conn = getMyConnection();
				Statement stt = conn.createStatement();
					
					System.out.println("Nhap Ten Bai Viet: ");
					String nameinput = scanner.nextLine();
					System.out.println("Nhap Danh Muc: ");
					int catinput = scanner.nextInt();
					String sqlfind = "Select * from News where Namenew ="+"'"+nameinput+"'"+"and"+"'"+catinput+"'";
					ResultSet rs = stt.executeQuery(sqlfind);	
					System.out.println("ID				CategoryID				Name				Description					Detail				Date	 		Iamge			UserID");

					while(rs.next()) {
							int newid = rs.getInt("NewID");
							int catid = rs.getInt("CategoryID");
							String namenew = rs.getString("Namenew");
							String Des = rs.getString("Description");
							String Detail = rs.getString("Detail");
							Date   Date = (Date) rs.getDate("Date");
							String User = rs.getString("UserID");
							
							System.out.println(newid+"				"+catid+"				"+namenew+"					"+Des+"					"+Detail+"				"+Date+"			"+User);

					}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void showMenu() {
		NewsDAO nd = new NewsDAO();
		do {
			System.out.println("----Menu----");
			System.out.println("1: Add  news");
			System.out.println("2: Show News");
			System.out.println("3: Edit News");
			System.out.println("4: Delete News");
			System.out.println("5: Find News");
			System.out.println("6: Exit");
			System.out.println("------------");
			System.out.print("Please choose number ");
			inputNumber = scanner.nextInt();
			switch(inputNumber) {
			case 1:
				nd.addNews();
				nd.askForContinue();
				break;
			case 2:
				nd.showNews();
				nd.askForContinue();
				break;
			case 3:
				nd.editNews();
				nd.showNews();
				break;
			case 4:
				nd.deleteNews();
				nd.askForContinue();
				break;
			case 5:
				nd.findNews();
				nd.askForContinue();
				break;
			case 6:
				System.out.println("Exit!");
				break;
			default:
				System.out.println("Your input number wrong, please input again: ");	
			}

		}while(inputNumber!=6);
	}
	public void askForContinue() {
			System.out.println("Do you want continue or exit? (Press 6 to end program) :");

	}
}
