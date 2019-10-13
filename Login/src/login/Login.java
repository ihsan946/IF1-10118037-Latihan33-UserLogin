package login;
import java.util.Scanner;

public class Login {

	private static String usName;
	private static String passWord;

	/**
	 * 
     * @param args
	 
	 */
	public static void main(String[] args) {
                            //input
                            Scanner scanner = new Scanner(System.in);
                            
                            System.out.print("Masukkan Username = ");
                            usName = scanner.nextLine();
                            
                            System.out.print("Masukkan Password = ");
                            passWord = scanner.nextLine();
                            
                            //proses
                            User user = new User();
                            user.pengecekanLogin(usName, passWord);
                            
                            
                                    
	}

}