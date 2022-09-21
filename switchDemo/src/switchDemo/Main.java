package switchDemo;

public class Main {

	public static void main(String[] args) {
       char grade ='A';
       switch(grade) {
       case'A':
    	   System.out.println("Mükemmmel : Geçtiniz");
    	   break;
       case'B':
    	   System.out.println("Çok Güzel : Geçtiniz");
    	   break;
       case'C':
       System.out.println("Ýyi : Geçtiniz");
       case'D':
    	   System.out.println("Fena Deðil : Geçtiniz");
    	   break;
       case'F':
    	   System.out.println("Maalesef Kaldýnýz");
    	   break;
    	   default:
    		   System.out.println("Geçersiz not girdiniz");
       }
	}

}
