package ExpressionProblem;

public interface Expression {
	public <T> T accept(Vistor<T> V);
}
