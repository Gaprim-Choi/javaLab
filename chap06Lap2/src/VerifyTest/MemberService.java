package VerifyTest;

public class MemberService {
	static boolean login(String id, String pw) {
		if(id.equals("hong") && pw.equals("12345")) {
			System.out.println("로그인 되었습니다.\n아이디 :"+id+"\n패스워드:"+pw);
			return true;
		} else {
			System.out.println("로그인에 실패 하였습니다.\n아이디 :"+id+"\n패스워드:"+pw);
			return false;
		}
	}
	
	static void logout(String id) {
		System.out.println(id + "가 로그아웃 되었습니다.");
	}
}
