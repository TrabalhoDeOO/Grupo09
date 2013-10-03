/**
 * 
 */
package game.entidade;

/**
 * 
 */

/**
 * @author Bruno
 *
 */
public class Adm {
	
	public int senha;
	public String login;

	/**
	 * 
	 */
	public Adm() {
		// TODO Auto-generated constructor stub
		
		this.senha = 0;
		this.login = "sem login";
		
	}
	
	public Adm(int senhaAdm, String loginAdm){
		
		this.senha = senhaAdm;
		this.login = loginAdm;
		
	}
	
	
	public int getSenha(){
		return senha;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public String getLogin(){
		return login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public void criarAdm(int senhaAdm, String loginAdm){
		
		this.login = loginAdm;
		this.senha = senhaAdm;
		
	}
	
	 

}
