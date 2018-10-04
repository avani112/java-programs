public interface InterfaceTest{
    int pop();
    void push(int s);
    void print();
};
class StackImp implements InterfaceTest{
   int a[]=new int[10];
    int st_top;
    StackImp(int x){
        st_top=-1;
        a=new int[x];
    }
    public void push(int num){
        System.out.println("running StackImp push \n");
        if(st_top==9) System.out.println("stack full");
        else a[++st_top]=num;
    }
    public int pop(){
        System.out.println("running StackImp pop \n");
        if(st_top<0){
            System.out.println("StackImp stack is empty");
            return 0;
        }
        else return a[st_top--];
    }
    public void print(){
        System.out.println("this is print function for StackImp..\n");
        for(int i=0;i<10;i++) System.out.println(a[i]);
    }
}
class GrowStack implements InterfaceTest{
    int a[];
    int top;
        GrowStack(int x){
            top=-1;
            a=new int[x];
        }
    public int pop(){
        System.out.println("running GrowStack pop \n");
        if(top<0){
            System.out.println("GrowStack stack is empty");
            return 0;
        }
        else return a[top--];
    }
    public void push(int num){
        System.out.println("running GrowStack push \n");
        if(top==a.length-1){
            int temp[]=new int[a.length*2];
            for(int i=0;i<a.length;i++) temp[i]=a[i];
            a=temp;
            a[++top]=num;
        }
        else a[++top]=num;
    }
    public void print(){
        System.out.println("this is print function for GrowStack..\n");
        for(int i=0;i<10;i++) System.out.println(a[i]);
    }
    
}
class MyStack{
    public static void main(String args[]){
        InterfaceTest Test;
        StackImp si=new StackImp(5);
        GrowStack gs= new GrowStack(5);
        Test=gs;
        for(int i=0;i<10;i++) Test.push(i);
        for(int i=0;i<10;i++) System.out.println(Test.pop());
        Test=si;
        for(int i=0;i<5;i++) Test.push(i);
        for(int i=0;i<5;i++) System.out.println(Test.pop());
    }
}

