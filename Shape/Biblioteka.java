public class Biblioteka{
	
	private String emri;
	private Libri[] librat;
	private int index = 0;
	
	public Biblioteka(String e, int nrLibrave){
		emri = e;
		librat = new Libri[nrLibrave];
	}

	public String getEmri(){
		return emri;
	}

	public void setEmri(String newEmri){
		emri = newEmri;
	}
	
	public boolean ekziston(Libri l){
		if(l == null){
			System.out.println("Libri nuk eshte inicializuar!");
			return false;
		}
		for(int i =0; i < index; i++){
			if(librat[i].equals(l))
				return true;
		}
		return false;
	}
	
	public void shtoLibrin(Libri l){
		if(l == null){
			System.out.println("Libri nuk eshte inicializuar!");
			return;
		}
		if(index == librat.length){
			System.out.println("Nuk ka vend ne varg!");
			return;
		}
		if(ekziston(l)){
			System.out.println("Libri ekziston ne varg!");
			return;
		}
		librat[index++] = l;
	}
	
	public Enciklopedia maxNumriFaqeve(){
		if(index == 0){
			System.out.println("Nuk ka asnje liber ne varg!");
			return null;
		}
		Enciklopedia temp = null;
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Enciklopedia){
				Enciklopedia e = (Enciklopedia)librat[i];
				if(temp == null || temp.getNrFaqeve() <= e.getNrFaqeve())
					temp = e;
			}
		}
		if(temp == null)
			System.out.println("Nuk ka asnje Enciklopedi ne varg!");
		return temp;
	}
	
	public LibriShkollor libriDrejtimit(String d){
		if(index == 0){
			System.out.println("Nuk ka asnje liber ne varg!");
			return null;
		}
		LibriShkollor l = null;
		for(int i = 0; i <  index; i++){
			if(librat[i] instanceof LibriShkollor){
				l = (LibriShkollor)librat[i];
				if(l.getDrejtimi().equals(d))
					return l;
			}
		}
		if(l == null)
			System.out.println("Nuk ka asnje Liber Shkollor ne varg!");
		else
			System.out.println("Nuk ka asnje Liber Shkollor me kete drejtim ne varg!");
		return l;
	}
	
	public void shtypKopertinat(boolean k){
		for(int i = 0; i < index; i++){
			if(librat[i] instanceof Botohet){
				Botohet b = (Botohet)librat[i];
				if(b.kaKopertina() == k)
					System.out.println(b);
			}
		}
	}
	
	



public static void main(String[] args){
    Biblioteka b = new Biblioteka("Library", 50);
    LibriShkollor l1 = new LibriShkollor(12345, "Java 1", "John Doe", "SHKI 1");
    b.shtoLibrin(l1);
    LibriShkollor l2 = new LibriShkollor(22345, "Java 2", "Kela Johnson", "SHKI 1");
    b.shtoLibrin(l2);
    Enciklopedia e1  = new Enciklopedia(11345, "Anatomia 1", "Author 1", 500);
    Enciklopedia e2  = new Enciklopedia(14345, "Anatomia 2", "Author 2", 200);
    Enciklopedia e3  = new Enciklopedia(15345, "Anatomia 3", "Author 3", 500);
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println("maxNumriFaqeve:\n" + b.maxNumriFaqeve());
    System.out.println();
    System.out.println("Drejtimi \"SHKI 1\":\n" + b.libriDrejtimit("SHKI 1"));
    System.out.println();
    System.out.println("Librat me kopertina:");
    b.shtypKopertinat(true);
    System.out.println();
}
}


