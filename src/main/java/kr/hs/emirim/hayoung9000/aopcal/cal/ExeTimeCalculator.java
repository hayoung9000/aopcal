package kr.hs.emirim.hayoung9000.aopcal.cal;

public class ExeTimeCalculator implements Calculator{ //시간을 측정을 담당
	private Calculator delegate; //실제 팩토리 계산을 담당
	
	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d\n",
				delegate.getClass().getSimpleName(),
				num, (end - start));
		return result;
	}
}
