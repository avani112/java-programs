public class leftrotation {
    public static void main(String args[]) {
    	int a []= {1,2,3,4,5};
    	int d =2;
    	
    	for (int i =0;i<d;i++) {
    		int first ,j;
    		first =a[0];
    		for ( j=0;j<a.length-1;j++) {
    			a[j]=a[j+1];
    		}
    			a[j]=first;
    		}
    	
    	for(int k =0;k<a.length;k++) {
    		System.out.println(a[k]);
    	}
    }
}
