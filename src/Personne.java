
public class Personne {
	private String nom;
	private String telephone;
	private int age;
	
	public Personne() {
	}
	
	public Personne(String nom, String telephone, int age) {
		this.nom = nom;
		this.telephone = telephone;
		this.age = age;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", telephone=" + telephone + ", age=" + age + "]";
	}
	
	
	
}
