
public class Reverse {

	public static byte [] getReverse(byte[] str){
		byte[] result = new byte [str.length];

      for(int i=0; i<str.length;i++){
			result[i]= str[str.length-i-1];
	  }
		return 	result;
			
	}
	
	public static void main(String[] args) {
		String a= "Test reverse";
		
		byte[] str= a.getBytes();
		//byte[] result = new byte [str.length];
		
		System.out.println(new String(getReverse(str)));		
		

	}

}
