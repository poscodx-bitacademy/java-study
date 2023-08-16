package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		if ("앱".equals(function)) {
			runApp();
			return;
		}
		super.execute(function);
	}

	@Override
	protected void playMusic() {
		System.out.println("다운로드해서 음악 재생");
	}

	protected void runApp() {
		System.out.println("앱 실행");
	}
}
