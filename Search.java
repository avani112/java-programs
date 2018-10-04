/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
class Lsearch {
    boolean linearsearch(int a[],int keynum){
      boolean found=false;
      for(int i=0;i<10;i++){
          if(a[i]==keynum){
              found=true;
          }
      }
      if (found==true) System.out.println("found");
          else
              System.out.println("not found");
      return found;
    }
    boolean linearsearch(char b[],int keychar){
        boolean found=false;
      for(int i=0;i<10;i++){
          if(b[i]==keychar){
              found=true;
          }
      }
      if (found==true) System.out.println("found");
          else
              System.out.println("not found");
      return found;
    }
     
}
public class Search{
    public static void main(String args[]){
        Lsearch s=new Lsearch();
        int a[]={1,5,7,0,3,10,12,11,31,2};
        char b[]={'a','r','t','3','6','w','f','y','k','h'};
            int keynum=0, keychar='a' ;
            s.linearsearch(b, keychar);
            s.linearsearch(a, keynum);
            
    }
    
}