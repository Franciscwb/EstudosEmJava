package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toUpperCase();
		
		// Wrappers - Envolucro, s�o a vers�o de objeto dos tipos
		// primitivos!
		int a = 123;
		System.out.println(a);
	
	}
}
