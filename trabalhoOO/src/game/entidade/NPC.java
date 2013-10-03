package game.entidade;

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
	
}
