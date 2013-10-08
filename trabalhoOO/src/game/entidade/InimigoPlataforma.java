package game.entidade;

public class InimigoPlataforma extends Inimigo{
public int jump;

public InimigoPlataforma(){
	this.jump = 0;
}
public InimigoPlataforma(int Jump){
	this.jump= jump;
}
public int getJump() {
	return jump;
}

public void setJump(int jump) {
	this.jump = jump;
	}
}
