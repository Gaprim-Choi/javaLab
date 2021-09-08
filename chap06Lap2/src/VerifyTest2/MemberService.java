package VerifyTest2;

public class MemberService {

	static boolean login(String id, String pw) throws InterruptedException {

		String [] idList = {"hong","choi","kim"};
		String [] pwList = {"12345","00000","99999"};

		
		int num = 0;
		for(int i = 0; i < idList.length; i++) {
			//System.out.println(i);
			if(id.equals(idList[i])) {
				if (pw.equals(pwList[i])) {
					System.out.println("로그인 되었습니다.");
					num = 0;
					return true;
				}
			} else if (i==idList.length){
				System.out.println("로그인에 실패 하였습니다.");
				num = 1;
			}
		}
		return false;
	}
	
	static String userData(String id) {
		String [] idNmae = {"홍길동","최갑림","김밥"};
		String [] idList = {"hong","choi","kim"};
		
		String nameData = null;
		
		for(int i = 0; i <= idList.length; i++) {
			if(id.equals(idList[i])) {
				nameData = idNmae[i];
				return(nameData);
			}else {
				
			}
		}
		return nameData;
	}
	static int userAge(String id) {
		String [] idList = {"hong","choi","kim"};
		int [] AgeList = {17,27,24};
		
		int userage = 0;
		
		for(int i = 0; i <= idList.length; i++) {
			if(id.equals(idList[i])) {
				userage = AgeList[i];
				return(userage);
			}
		}
		return userage;
	}
	static void logout(String id) {
		System.out.println(id + "가 로그아웃 되었습니다.");
	}
}
