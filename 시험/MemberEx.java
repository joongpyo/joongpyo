package exam4_1;

import java.sql.*;

public class MemberEx {

	public static void main(String[] args) throws Exception {
		MemberDao dao = new MemberDao();
		
		boolean run = true;
		
		while(run) {
			int choice = dao.menu();
			
			switch(choice) {
			
			case 1:
				dao.selectMember();
				System.out.println("");
				break;
			
			case 2: 
				dao.insertMember();
				System.out.println("");
				break;
				
			case 3: 
				System.out.println("프로그램 종료");
				System.exit(0);
				System.out.println("");
				break;
				
			default:
				System.out.println("잘못 입력하셨습니다.\n초기화면으로 돌아갑니다.");
				break;
			}
		}



	}

}
