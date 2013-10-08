package game.entidade;

public class InimigoPlataforma extends Inimigo{
public int jump;

public InimigoPlataforma(){
	super();
	this.jump = 0;
}
public InimigoPlataforma(int jump){
	this.jump= jump;
}
public int getJump() {
	return jump;
}

public void setJump(int jump) {
	this.jump = jump;
	}
}
