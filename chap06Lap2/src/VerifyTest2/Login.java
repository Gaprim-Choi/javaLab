package VerifyTest2;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력하세요");
		
		String Name = new String();
		String inID = new String();
		String inPW = new String();
		int inAge = 0;

		boolean O = false;

		for (int i = 0; i<3; i++) {
			//System.out.println(i);
			String input = sc.next();
			if(i==2 && input.equals("로그아웃")) {
				MemberService.logout(inID);
			}else if(i==0 && input != null) {
				inID = input;
				System.out.println("pw를 입력하세요");
			}else if (i==1 && inID != null) {
				inPW = input;
				O = MemberService.login(inID,inPW);
				MemberService.userData(inID);
				MemberService.userAge(inID);
				
				if (O ==false) {
					System.out.println("다시 로그인 해주세요");
					i=-1;
				}else {
					Member N = new Member
							(MemberService.userData(inID),inID,inPW,MemberService.userAge(inID));
					System.out.println(MemberService.userData(inID) + "님 환영합니다.");
					System.out.println("이름 :" + N.Name + "\n ID :" + N.Id + "\n Password" + N.Pw + "\n 나이:" + N.Age);
				}
			}
		}
	}
}
