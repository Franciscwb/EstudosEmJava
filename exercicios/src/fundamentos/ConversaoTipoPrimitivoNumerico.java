package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // conver��o impl�cita
		System.out.println(a); 
		
		float b = (float)1.12345678888; // convers�o explicita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // convers�o explicita (CAST)
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e; // Convers�o expl�cita (CAST)
		System.out.println(f);
	}
}
