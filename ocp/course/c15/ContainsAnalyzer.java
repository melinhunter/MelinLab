package course.c15;

public class ContainsAnalyzer implements StringAnalyzer {
	public boolean analyze(String target, String keyStr) {
		return target.contains(keyStr);
	}
}
