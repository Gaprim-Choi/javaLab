package test02;

public class ArrayEx {
	public static void main(String[] args) {
		
		int[][] s = new int[8][9]; // 8행 9열
		// 구구단 세로로 한줄로 출력
		for (int dan = 0; dan <= 7; dan++) { // 행
		System.out.println("[" + (dan + 2) + "단]");
		for (int i = 0; i <= 8; i++) { // 열
		s[dan][i] = (dan + 2) * (i + 1);
		System.out.println((dan + 2) + "*" + (i + 1) + "=" + s[dan][i]);
		}
		System.out.println("");
		}
		// 확장 for문을 이용
		System.out.println("*** 향상된 for문을 이용 ***");
		int dan = 2;
		int num;
		for (int[] i: s) {
		System.out.println("[" + dan + "단]");
		num = 1;
		 // 작성 위치
		for(int j:i ) {
			System.out.println(dan+"X"+num+"="+j*j);
			num++;
		}
		System.out.println("");
		dan++;
		}
	}

}
