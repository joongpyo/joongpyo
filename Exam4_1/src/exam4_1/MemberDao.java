package exam4_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberDao {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	int menu() {
		System.out.println("1. 회원목록 출력 | 2. 회원가입정보 입력 | 3. 프로그램 종료");
		System.out.print("선택 > ");
		int choice = sc.nextInt();
		System.out.println("");
		
		return choice;
	}
	
	
	void selectMember() throws Exception {
		
		System.out.println("회원목록을 출력합니다.");
		System.out.println("");
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/kordb";
		String uid = "jp";
		String passwd = "1234";
		
		conn = DriverManager.getConnection(url, uid, passwd);
		String sql = "SELECT * FROM kordb_member ORDER BY mem_id ASC;";
		
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		while(rs.next()) { 
			Member m = new Member(); 
			
			m.setMemId(rs.getInt(1));
			m.setMemName(rs.getString(2));
			m.setMemPasswd(rs.getString(3));
			m.setMemDate(rs.getString(4));
			m.setMemGender(rs.getString(5));
			m.setMemIntro(rs.getString(6));
			
			System.out.println(m.toString());
			
		}
				
	
	}
	
	
	void insertMember() { 
		System.out.println("회원정보를 입력합니다.");
		System.out.println("");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost:3306/kordb";
			String uid = "jp";
			String passwd = "1234";
			
			conn = DriverManager.getConnection(url, uid, passwd);
			
			String sql = "INSERT INTO kordb_member VALUES(null, ?, ?, now(), ?, ? );";
			 pstmt = conn.prepareStatement(sql);
			
			Member m = new Member();
			m.setMemName("이민지");
			m.setMemPasswd("1234");
			m.setMemGender("F");
			m.setMemIntro("HI");
			
			pstmt.setString(1, m.getMemName()); 
			pstmt.setString(2, m.getMemPasswd()); 
			pstmt.setString(3, m.getMemGender());
			pstmt.setString(4, m.getMemIntro());
			
			int row = pstmt.executeUpdate(); 
			
			if(row > 0) {  
				System.out.println(m.getMemName() + "님의 회원가입이 완료 되었습니다.");
			}
			
			else {
				System.out.println("회원가입에 실패하였습니다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

