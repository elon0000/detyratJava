public class Enciklopedia extends Libri implements Botohet {

    private int nrFaqeve;

    public Enciklopedia(int isbn, String titulli, String autori, int nrFaqeve){
        super(isbn, titulli, autori);
        this.nrFaqeve = nrFaqeve;
    }

    public int getNrFaqeve(){
        return nrFaqeve;
    }

    public void setNrFaqeve(int newNrFaqeve){
        nrFaqeve = newNrFaqeve;
    }

    @Override

    public String shtoAutorin(){
        return "";
    }

    @Override

    public boolean kaKopertina(){
        return true;
    }

    @Override

    public boolean kaUshtrime(){
        return false;
    }

    @Override

    public String toString(){
        return "ISBN " + this.getIsbn() + " Titulli " + this.getTitulli() + " [Autoret] kan nr e faqeve " + this.nrFaqeve + " Autori " + this.getAutori();
    }

    public static void main(String[] args) {
        Enciklopedia enc = new Enciklopedia(1,"Book 1", "John Doe", 2);

        System.out.println(enc);
    }
    
    
}