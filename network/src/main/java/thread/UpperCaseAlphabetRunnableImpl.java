package thread;

public class UpperCaseAlphabetRunnableImpl extends UpperCaseAlphabet implements Runnable {
	@Override
	public void run() {
		print();
	}
}
