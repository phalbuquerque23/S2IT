package br.com.s2it.exercicio9;

public class BinaryTree{

	private int valor;
	private BinaryTree rigth;
	private BinaryTree left;
	
	
	public BinaryTree(int value) {
		this.valor = value;
	}
	
	public int getValue() {
		return valor;
	}
	public BinaryTree getRigth() {
		return rigth;
	}
	public BinaryTree getLeft() {
		return left;
	}
	
	public void insertRight(BinaryTree binaryTree)
	{
		this.rigth = binaryTree;
	}
	
	public void insertLeft(BinaryTree binaryTree)
	{
		this.left = binaryTree;
	}
	
	public int somaSubsequentes(final BinaryTree binaryTree){
		
		if(binaryTree == null){
			return 0;
			}else {
			
		
		
		return binaryTree.valor +
				somaSubsequentes(binaryTree.getLeft()) + 
				somaSubsequentes(binaryTree.getRigth());
		}
	}
	
	
}