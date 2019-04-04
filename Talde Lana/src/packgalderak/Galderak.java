package taldeLana;

public class Galderak {
	
	//atributuak
	
	private String galdera;
	private String erantzunaA;
	private String erantzunaB;
	private String erantzunaC;
	private String erantzunaD;
	private String erantzunZuzena;
	private boolean espeziala;
	
	
	
	//metodoak
	
	
	public Galderak (String pGaldera, String pErantzunaA, String pErantzunaB, String pErantzunaC, String pErantzunaD, String pErantzunZuzena, boolean pEspeziala) {
		
		this.galdera = pGaldera; 
		this.erantzunaA = pErantzunaA;
		this.erantzunaB = pErantzunaB;
		this.erantzunaC = pErantzunaC;
		this.erantzunaD = pErantzunaD;
		this.erantzunZuzena = pErantzunZuzena;
		this.espeziala = pEspeziala;
	}
	
	

	
	//beste metodak
	
	public boolean erantzunZuzenaDa(String pAukeratutakoErantzuna) {return true;}
	
	public boolean erantzunZuzenaDaEtaEspeziala(String pAukeratutakoErantzuna) {
		
		return true;		
		
		
	}
	public void galderaErakutzi(String pGaldera, String pErantzunaA, String pErantzunaB, String pErantzunaC, String pErantzunaD) {}
}
