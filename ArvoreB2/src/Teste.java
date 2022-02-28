
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//NoArvore no = new NoArvore(15,new NoArvore(10,null,null), new NoArvore(50,new NoArvore(20,null,null),null));
		NoArvore no10 = new NoArvore(10,null,null);
		
		NoArvore no20 = new NoArvore(20,null,null);
		//o filho esquerdo do 50 é 20
		NoArvore no50 = new NoArvore(50,no20,null);
		//o filho esquerdo do 15 é 50 e o direito é 10
		NoArvore no15 = new NoArvore(15,no10,no50);
		
		System.out.println("Pre-ordem");
		NoArvore.imprimirPreOrdem(no15);
		System.out.println(" ");
		
		System.out.println("Em-ordem");
		NoArvore.imprimirEmOrdem(no15);
		System.out.println(" ");
		
		System.out.println("Pos-ordem");
		NoArvore.imprimirPosOrdem(no15);
		System.out.println(" ");
	}

}
