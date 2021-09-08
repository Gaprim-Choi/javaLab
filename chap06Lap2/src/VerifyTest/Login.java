package VerifyTest;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		
		String inID = new String();
		String inPW = new String();
		boolean O = false;
		
		Member N = new Member("홍길동",inID,inPW,27);
		
		for (int i = 0; i<3; i++) {
			String input = sc.next();
			if(i==2 && input.equals("로그아웃")) {
				MemberService.logout(inID);
			}else if(i==0 && input != null) {
					inID = input;
					System.out.println("pw를 입력하세요");
			}else if (i==1 && inID != null) {
					inPW = input;
					O = MemberService.login(inID,inPW);
					if (O ==false) {
						System.out.println("다시 로그인 해주세요");
						i=-1;
					}else System.out.println(N.Name + "님 환영합니다.");
			}
		}
	}
}
