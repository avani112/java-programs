public class Vararg {
    static void test(int ... v){
        System.out.println("running main");
        int sum=0;
        for(int x:v){
            sum+=x;
        }
        System.out.println(sum);
    }
    static void test(int x,int y){
        System.out.println("running test");
        int sum=0;
        sum=x+y;
        System.out.println(sum);
    }
    static void test(char ... c){
        System.out.print("contents are:\n");
        for(char x: c){
            System.out.print(x+" "+"\n");
        }
    }
    public static void main(String args[]){
        test(1,6,2);
        test(6,10,41,2,34,6);
        test(1,5);
        test(4,8);
        test(85,71);
        test(103,117);
        test(8+4);
        test('w','r','t');
        test('g','u');
        test('v');
        char a='g',z='u';
        int b=a,x=z;
        System.out.println("this is ascii value of g: "+b);
        System.out.println("this is ascii value of u: "+x);
    }
}
