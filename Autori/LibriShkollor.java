public class LibriShkollor extends Libri implements Botohet {
    
    private String drejtimi;

    public LibriShkollor(int isbn, String titulli, String autori, String drejtimi){
        super(isbn, titulli, autori);
        this.drejtimi = drejtimi;
    }

    public String getDrejtimi(){
        return drejtimi;
    }

    public void setDrejtimi(String newDrejtimi){
        drejtimi = newDrejtimi;
    }
    
    @Override

    public String shtoAutorin(){
        return "";
    }


    @Override
    public boolean kaKopertina(){
        return false;
    }

    @Override
    public boolean kaUshtrime(){
        return true;
    }

    @Override

    public String toString(){
        return "ISBN" + this.getIsbn() + "Titulli" + this.getTitulli() + "Autoret" + this.shtoAutorin() + "Drejtimi" + this.drejtimi;
    }
}
