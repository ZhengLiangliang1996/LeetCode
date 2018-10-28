package ExpressionProblem;

public class Lit1 implements Expression{
	int x;
	public Lit1(int x){this.x = x;}
	public<T> T accept(Vistor<T> vistor){
		return vistor.lit(this);
	}
}


