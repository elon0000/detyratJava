public abstract class Libri{
    
    private int isbn;

    private String titulli;

    private String autori;

    public Libri(int isbn, String titulli, String autori){
        this.isbn = isbn;
        this.titulli = titulli;
        this.autori = autori;
    }

    public int getIsbn(){
        return isbn;
    }

    public String getTitulli(){
        return titulli;
    }

    public void setTitulli(String newTitulli){
        titulli = newTitulli;
    }

    public String getAutori(){
        return autori;
    }

    public void setAutori(String newAutori){
        autori = newAutori;
    }

    public abstract String shtoAutorin();

    @Override

    public String toString(){
        return "ISBN " + this.isbn + " Titulli " + this.titulli + "Autori" + this.autori;
    }

    public boolean equals(Object obj)   
    {  
    if (obj == null)   
    return false;  
    if (obj == this)  
    return true;  
    return this.getIsbn() == ((Libri) obj). getIsbn();  
    }

}
