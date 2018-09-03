package tn.insat.gl4.domain;

public class Yang extends Thread {
	public Yang(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			try {
				sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
			}
		}
		System.out.println("DONE! " + getName());
	}

	public void WRITE_SOMETHING(String INPUT_PARAMETER) {
		System.out.println(INPUT_PARAMETER);
	}

	public static void main(String[] args) {
		new Yang("Good").start();
		new Yang("Bad").start();
	}

	public String thisIsCutAndPaste(String pFirst, int pSecond) {
		System.out.println("New world");
		return "New world";
	}
}