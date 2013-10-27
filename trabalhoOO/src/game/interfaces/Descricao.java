package game.interfaces;

import java.util.Scanner;

public interface Descricao {
	
	Scanner input=new Scanner(System.in);
	
	public void criarDescricao(String desc);
	public String descricao();

}
