public  class Exercise{
  public static String toBinary(int decimal){
      int binary[] = new int[40];
      int index = 0;
      String binary_string = "";
      while(decimal > 0){
        binary[index++] = decimal%2;
        decimal = decimal/2;
      }
      for(int i = index-1;i >= 0;i--){
        binary_string += binary[i];
      }
      return binary_string;
  }
  
  public static String toOctal(int decimal){
    int rem;
    String octal="";
    char octalchars[]={'0','1','2','3','4','5','6','7'};
    while(decimal>0)
    {
       rem=decimal%8;
       octal=octalchars[rem]+octal;
       decimal=decimal/8;
    }
    return octal;
  }
  
  public static String toHex(int decimal){    
     int rem;  
     String hex="";   
     char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    while(decimal>0)  
     {  
       rem=decimal%16;   
       hex=hexchars[rem]+hex;   
       decimal=decimal/16;  
     }  
    return hex;  
  }    
  
   public static String[] Calculate(int decimal) {
      return new String[] {String.valueOf(toBinary(decimal)), String.valueOf(toOctal(decimal)), String.valueOf(toHex(decimal))};
    }
}
