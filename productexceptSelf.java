class productexceptSelf{
    public static void main(String[] args) {
        int[] arr={10, 3, 5, 6, 2};
        int product=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j&&j<arr.length){
                    product=product*arr[j];
                    
                }
                 else
               continue;
               
            }
            System.out.println(product);
            product=1;
            
        }
        
    }}
