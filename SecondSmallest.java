class SecondSmallest{
    public static void main(String[] args) {
        int[] value={25,5,1,24,29};
        int size=value.length;
        int first=0;
        int second=0;
        int min=Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if(value[i]<min){
                 min=value[i];
                 
                 }
                 first =min;
       
        }
        for (int i=0;i<size; i++) {
            if(sec_min>first && sec_min>value[i]&&value[i]!=min){
                sec_min=value[i];
                
            }
            second=sec_min;
           
        }
        System.out.println("Second smallest is:"+second);
    }
    


    }

