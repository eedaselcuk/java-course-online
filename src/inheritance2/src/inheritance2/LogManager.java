package inheritance2;

public class LogManager {
	public void log(int LogType) {
		if(LogType == 1) {
			System.out.println("Veritabanýna loglandý.");
		}
		else if(LogType == 2) {
			System.out.println("Dosya gönderildi.");
		}else
			System.out.println("Email iletildi.");
	}
}
