package ExpressionProblem;

public interface Vistor<T> {
	public T lit(Lit1 x);
	public T add(T x,T y);
}

