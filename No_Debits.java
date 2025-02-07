

class No_Debits
{
    public static void main(String[] args) {
        int[] Cash={900,1500,600,1200,400};
        int  max=0;
        int size=Cash.length;
        int j=0;
        for (int i = 0; i < size; i++) {
            
                
            
          if(max>Cash[i]){
            j=j+1;

            }
            max=Cash[i];
       
        
            
        }
        System.out.print(j);
    }}
