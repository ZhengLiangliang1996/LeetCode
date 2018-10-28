package day18;

public class KoKoEatingBananas {
	//二分枚举
	public static int minEatingSpeed(int[] piles,int H){
		int n = piles.length;
		int l = 1;
		int r = 100000000;
		int mid = 0;
		while(l <= r){
			mid = (l + r) / 2;
			int t = 0;
			for(int i = 0;i < n; i++){
				t += ((piles[i] + mid - 1)/ mid);
				if(t > H) break;
			}
			if(t > H) l = mid+1;
			else {
				r = mid - 1;
			}
		}
		return l;
	}
	
	public static void main(String[] args) {
		int[] piles = {3,6,7,11};
		int H = 8;
		System.out.println(minEatingSpeed(piles, H));
	}
}
