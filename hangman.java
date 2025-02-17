//Marcon Tommaso 4BIA

package gioco_impiccato;

public class hangman {
	
	private String parola;
	private char[] progressi;
	private int tentativi;
	private boolean vittoria=false;
	
	
	public hangman(String parola, int tentativi) {
		this.parola=parola.toLowerCase();
		progressi = new char[parola.length()];
		for (int i=0; i<parola.length(); i++) {
			setProgressi(i, '_');
		}
		this.setTentativi(tentativi);
		this.vittoria=false;
	}
	
	public boolean tentativo (char lettera) {
		boolean giusta = false;
		for(int i=0; i<parola.length();i++) {
			if(parola.charAt(i)==lettera) {
				giusta=true;
				setProgressi(i, lettera);
			}
		}
		if (!giusta) {
			setTentativi(getTentativi() - 1);
		}
		return giusta;	
	}
	
	
	public boolean controllavittoria() {
		return parola.equals(getProgressi());
	}
	
	public boolean finegioco() {
		if (tentativi==0 || controllavittoria()==true) {
			return true;
		} else return false;
	}
	public int getTentativi() {
		return tentativi;
	}

	public void setTentativi(int tentativi) {
		this.tentativi = tentativi;
	}

	public String getProgressi() {
		return String.valueOf(progressi);
	}

	public void setProgressi(int i, char progressi) {
		this.progressi[i] = progressi;
	}
	
}
