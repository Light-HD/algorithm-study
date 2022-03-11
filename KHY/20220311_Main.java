import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] a = br.readLine().toCharArray();
		char[] b = br.readLine().toCharArray();

		int dp[][] = new int[b.length+1][a.length+1];
		
		//첫 자리부터 비교
		for(int i = 1; i <= b.length; i++){
			for(int j = 1; j <= a.length; j++){
				// 같으면
				if(a[j-1] == b[i-1])
					//이전꺼에서 한개 증가
					dp[i][j] = dp[i-1][j-1] + 1;
				// 다르면
				else{
					// 왼쪽 꺼랑 위쪽 꺼랑 비교해서 더 큰 것으로 
					dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[b.length][a.length]);
	}
}
