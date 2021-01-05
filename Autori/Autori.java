class Autori {
    private int id;
    private String emri;
    private String mbiemri;

    public Autori(int id, String emri, String mbiemri){
        this.id = id;
        this.emri = emri;
        this.mbiemri = mbiemri;
    }

    public int getId(){
        return id;
    }

    public String getEmri(){
        return emri;
    }

    public void setEmri(String newEmri){
        emri = newEmri;
    }

    public String getMbiemri(){
        return mbiemri;
    }

    public void setMbiemri(String newMbiemri){
        mbiemri = newMbiemri;
    }

     @Override

     public boolean equals(Object obj)   
    {  
     if (obj == null)   
     return false;  
     if (obj == this)  
     return true;  
     return this.getId() == ((Autori) obj). getId();  
    }

    @Override

    public String toString(){
        return "ID " + this.id + " Emri " + this.emri + " Mbiemri " + this.mbiemri;
    }
}