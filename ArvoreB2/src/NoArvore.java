
public class NoArvore {
	private int valor;
	private NoArvore esquerdo;
	private NoArvore direito;
	
	public NoArvore(int valor, NoArvore esquerdo, NoArvore direito)
	{
		this.valor = valor;
		this.esquerdo = esquerdo;
		this.direito = direito;
	}
	
	public static void imprimirPreOrdem(NoArvore n)
	{
		//Raiz
		System.out.print(n.valor + " ");
		//Esquerdo
		if(n.esquerdo!=null)
		{imprimirPreOrdem(n.esquerdo);}
		if(n.direito!=null)
		{imprimirPreOrdem(n.direito);}
	}

	public static void imprimirEmOrdem(NoArvore n)
	{
		if(n.esquerdo!=null)
		{imprimirEmOrdem(n.esquerdo);}
		System.out.print(n.valor + " ");
		if(n.direito!=null)
		{imprimirEmOrdem(n.direito);}
	}
	
	public static void imprimirPosOrdem(NoArvore n)
	{
		if(n.esquerdo!=null)
		{imprimirEmOrdem(n.esquerdo);}
		if(n.direito!=null)
		{imprimirEmOrdem(n.direito);}
		System.out.print(n.valor + " ");
	}
}
