package hw9_1;

import java.util.*;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw9_1 : 이현복");
		Scanner sc = new Scanner(System.in);
		String first, second; 					// 첫번째 문자열과 두번째 문자열 입력받기 위한 변수
		System.out.print("첫번째 문자열 입력:");
		first = sc.nextLine(); 					// 첫번째 문자열 받기(기준 enter)
		System.out.print("두번째 문자열 입력:");
		second = sc.nextLine(); 				// 두번째 문자열 받기(기준 enter)
		LCS(first, second); 					// LCS 메소드에 first와 second 입력
	}

	public static void LCS(String first, String second) {
		int m = first.length(); 					// 첫번째 문자열 길이를 변수 m에 저장
		int n = second.length(); 					// 두번째 문자열 길이를 변수 n에 저장
		String[] firstString; 						// 배열 firstString 선언
		String[] secondString; 						// 배열 secondString 선언
		firstString = first.split(""); 				// 문자열 하나씩 나눠서 배열 firstString에 저장
		secondString = second.split(""); 			// 문자열 하나씩 나눠서 배열 secondString에 저장
		String[][] lcs = new String[m + 1][n + 1]; 	// 최장공통부분순서 문자열을 저장할 이중배열 lcs 선언
		for (int i = 0; i <= m; i++)				// lcs[0]인 행을 모두 빈칸으로 저장
			lcs[i][0] = "";

		for (int i = 0; i <= n; i++)				// lcs[0]인 열을 모두 빈칸으로 저장
			lcs[0][i] = "";

		for (int i = 1; i <= m; i++) {				// i를 1번째부터 m번째 까지 반복
			for (int j = 1; j <= n; j++) {			// j를 1번째부터 n번째 까지 반복
				if (firstString[i - 1].compareTo(secondString[j - 1]) == 0)		// 첫번째 문자열과 두번째 문자열이 같으면
					lcs[i][j] = lcs[i - 1][j - 1].concat(firstString[i - 1]);	// lcs[i-1][j-1]번째에 현재 기준인 첫번째 문자열 추가

				else {															// 아니면
					if (lcs[i - 1][j].length() > lcs[i][j - 1].length())		// lcs[i-1][j]의 길이와 lcs[i][j-1]의 길이 중
						lcs[i][j] = lcs[i - 1][j];								// 더 큰값을 lcs[i][j]에 저장

					else
						lcs[i][j] = lcs[i][j - 1];

				}
			}
		}
		System.out.println("LCS 길이 = " + lcs[m][n].length());					// lcs의 길이 출력
		System.out.println("LCS = " + lcs[m][n]);								// lcs 출력
	}

}
