package inheritance2;

public class LogManager {
	public void log(int LogType) {
		if(LogType == 1) {
			System.out.println("Veritaban�na logland�.");
		}
		else if(LogType == 2) {
			System.out.println("Dosya g�nderildi.");
		}else
			System.out.println("Email iletildi.");
	}
}
