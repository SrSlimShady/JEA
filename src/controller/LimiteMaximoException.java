package controller;
 
public class LimiteMaximoException extends Exception{
	private int qtd;
	public LimiteMaximoException(int q) {
		// TODO Auto-generated constructor stub
		super ("Limite M�ximo Permitido: 10");
		qtd=q;
	}
}
