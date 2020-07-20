package course.c15;

@FunctionalInterface
public interface StringAnalyzer {
	public boolean analyze(String target, String keyStr);
}