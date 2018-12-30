package day67;

import java.util.ArrayList;
import java.util.List;

import day40.KdiffPairsInAnArray;
import day63.isBalanceTree;

public class SuperEggProblem {
	//K is the number of eggs, N is the  level of floors
	//Time limit exceeded
	public int superEggDrop(int K, int N) {
		if(K < 1 || N < 1){
			return 0;
		}
		
		return Process1(N, K);
    }

	public int Process1(int n, int k) {
		if(n == 0){
			return 0;
		}
		if(k == 1){
			return n;
		}
		
		int min = Integer.MAX_VALUE;
		for (int i = 1; i != n + 1; i++) {
			if(i == n){
				
			}
			min = Math.min(min, Math.max(Process1(i - 1, k - 1), 
					Process1(n - i, k)));
			
		}
		return min + 1;
	}
	
	public int Process2(int n, int k) {
		if(n == 0){
			return 0;
		}
		if(k == 1){
			return n;
		}
		
		int[][] dp = new int[n + 1][k + 1];
		for(int i = 1; i != dp.length; i++){
			dp[i][1] = i;
		}

		for (int i = 1; i != dp.length; i++) {
			for (int j = 2; j != dp[0].length; j++) {
				int min = Integer.MAX_VALUE;
				for(int k1 = 1; k1 != i + 1; k1++){
					min = Math.min(min, Math.max(dp[k1 - 1][j - 1], dp[i - k1][j]));
				}
				dp[i][j] = min + 1;
			}
		}
		return dp[n][k];
	}
	
	public int Process3(int n, int k) {
		if(n == 0){
			return 0;
		}
		if(k == 1){
			return n;
		}
		
		int[][] dp = new int[n + 1][k + 1];
		for(int i = 1; i != dp.length; i++){
			dp[i][1] = i;
		}
		
		int[] cands = new int[k + 1];
		for(int i = 1; i != dp[0].length; i++) {
			dp[1][i] = 1;
			cands[i] = 1;
		}

		for (int i = 2; i < n + 1; i++) {
			for (int j = k; j > 1; j --) {
				int min = Integer.MAX_VALUE;
				int minEnum = cands[j];
				int maxEnum = j == k ? i / 2 + 1 : cands[j + 1];
				
				for (int k1 = minEnum; k1 < maxEnum + 1; k1++) {
					int cur = Math.max(dp[k - 1][j - 1], dp[i - k][j]);
					if (cur <= min) {
						min = cur;
						cands[j] = k;
					}
				}
				dp[i][j] = min + 1;
			}
		}
		
		return dp[n][k];
	}
	
	
}
