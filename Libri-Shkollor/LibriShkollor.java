public class LibriShkollor extends Libri {
    private String drejtimi;

    public LibriShkollor(int isbn, String titulli, int VitiPublikimit, String drejtimi){
        super(isbn, titulli, VitiPublikimit);
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi(){
        return drejtimi;
    }

    public void setDrejtimi(String newDrejtimi){
        drejtimi = newDrejtimi;
    }

    public String toString(){
        return "Libri Shkollor " + this.getIsbn() + " Titulli " + this.getTitulli() + " VitiPublikimit " + this.getVitiPublikimit() + " Drejtimi " + this.drejtimi; 
    }

    /*public static void main(String[] args) {
        LibriShkollor librishk = new LibriShkollor(1, "John Doe", 1990, "Shkenca Kompjuterike");

        System.out.println(librishk);

        
    } */

}





