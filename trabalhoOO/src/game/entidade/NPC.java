package game.entidade;

import java.util.ArrayList;

public class NPC {
	public String nome;
	public int funcao;
	public int sexo;
	
		
	public NPC() {
		this.nome = "...";
		this.funcao= 0;
		this.sexo= 0;
	}

	public NPC( String nome, int funcao, int sexo){
		this.nome = nome;
		this.funcao = funcao;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getFuncao() {
		return funcao;
	}

	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void listarNPC(ArrayList<NPC> npcs){
		String sexoN = null;
		String funcaoN = null;
		for (int i=0;i<npcs.size(); i++){
			if(npcs.get(i).sexo == 1){
				sexoN = "feminino";
			}else{
				sexoN = "masculino";
			}
			
			if (npcs.get(i).funcao == 1){
				funcaoN = "informante";
			}else if(npcs.get(i).funcao == 2){
				funcaoN = "auxiliar";
			}else if(npcs.get(i).funcao == 3){
				funcaoN = "negociante";
			}
			
			System.out.println(npcs.get(i).nome + " " + " " + funcaoN + " " + sexoN);
		}			

	}
}
