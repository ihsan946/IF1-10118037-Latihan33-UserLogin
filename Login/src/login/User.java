package login;

public class User {

	private final String username = "RizkiAdam";
	private final String password = "terbaikselalu";
	private boolean statusAkun;

	/**
	 * 
	 * @param parUserName
	 * @param parPassword
	 */
	private boolean cekAkun(String parUserName, String parPassword) {
                            if((parUserName.equals(this.username)) && (parPassword.equals(this.password))){
                                this.statusAkun = true;
                            }
                            else{
                                this.statusAkun = false;
                            }
	       return this.statusAkun;
	}

	/**
	 * 
	 * @param status
	 * @param parUserName
	 */
	private void hasilLogin(boolean status, String parUserName) {
                                status = this.statusAkun;
                                
                                if(status == true){
                                    System.out.println("********Hallo " + parUserName + "********"); 
                                }
                                else{
                                    System.out.println("Oooops, Username atau Password anda salah ");
                                }
                                
                                
	}

	/**
	 * 
	 * @param parUserName
	 * @param parPassword
	 */
	public void pengecekanLogin(String parUserName, String parPassword) {
                            cekAkun(parUserName, parPassword);
                            hasilLogin(statusAkun, parUserName);
	}

}