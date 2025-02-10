public class reverse {
    public static void main(String[] args) {
     String Str="aabbc";
     char[] reverse=new char[Str.length()-];
     int j=0;
     for(int i=Str.length()-1;i>=0;i--){
          reverse[i]=Str.charAt(j);
          j++;
     }  
     for(int i=0;i<Str.length();i++){
     System.out.println(reverse[i]);
     } 
    }}
    

