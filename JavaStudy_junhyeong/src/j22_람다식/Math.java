package j22_람다식;


@FunctionalInterface //메소드가 무조건 하나는 있어야 한다.
public interface Math<T1, T2> {
	public double calc(T1 value1, T2 value2);
	
}
