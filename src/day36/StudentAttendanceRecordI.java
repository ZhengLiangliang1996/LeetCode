package day36;

public class StudentAttendanceRecordI {
	 public static boolean checkRecord(String s) {
		 int a1=0, l=0;
		 char[] a = s.toCharArray();
		    for(int i=0;i<a.length;i++) {
		        if(a[i]=='A') a1++;
		        if(a[i]=='L') l++;
		        else l=0;
		        if(a1>=2||l>2) return false;
		    }
		    return true;  
	 }
	 
	 public static void main(String[] args) {
		String s = "PPALLP";
		System.out.println(checkRecord(s));
	 }
}
