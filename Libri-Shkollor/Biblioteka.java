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
	
	
	
	public static void main(String[] args){
		Biblioteka b = new Biblioteka("Library", 50);
		LibriShkollor l1 = new LibriShkollor(12345, "Java 1", 2, "SHKI 1");
		b.shtoLibrin(new LibriShkollor(13, "Book 44", 2010, "Psikologji"));
		b.shtoLibrin(new LibriShkollor(3, "Book 30", 1990, "SO"));
		b.shtoLibrin(l1);
		System.out.println();
		System.out.println();
		System.out.println("Drejtimi \"SHKI 1\":\n" + b.libriDrejtimit("SHKI 1"));
		System.out.println();
	}
}
