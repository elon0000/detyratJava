public class Libri {

    private int isbn;
    private String titulli;
    private int VitiPublikimit;

    public Libri(int isbn, String titulli, int VitiPublikimit){
        this.isbn = isbn;
        this.titulli = titulli;
        this.VitiPublikimit = VitiPublikimit;
    }

    public int getIsbn(){
        return isbn;
    }

    public String getTitulli(){
        return titulli;
    }

    public void setTitulli(String newTitulli){
        this.titulli = newTitulli;
    }

    public int getVitiPublikimit(){
        return VitiPublikimit;
    }

    public void setVitiPublikimit(int newVitiPublikimit){
        this.VitiPublikimit = newVitiPublikimit;
    }

    @Override

    public String toString(){
        return " ISBN: " + this.isbn + " " + " Titulli " + this.titulli + " " + " VitiPublikimit " + this.VitiPublikimit;
    }

    @Override  
    public boolean equals(Object obj)   
    {  
    if (obj == null)   
    return false;  
    if (obj == this)  
    return true;  
    return this.getIsbn() == ((Libri) obj). getIsbn();  
    }  
}
