
public class İkiSayiArasındakiSayilariRekursifToplama {

	

	  public static  int toplam (int ilk , int son)  {
		  
		  if ( son > ilk ) {
			  
			  return  son + toplam(ilk,son-1);
		  }
		  
		  else {
			  return ilk ;
		  }
	  }
		  
		
	  
	        
	  
		
		
		public static void main(String[] args) {
		
			int sonuc = toplam (3,26);
			
			System.out.println(sonuc);
			


	}}
	

