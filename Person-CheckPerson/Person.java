class Person {
    private String name;
    private String lastName;
    private String jobPosition;

    public Person(String name, String lastName, String jobPosition){
        this.name = name;
        this.lastName = lastName;
        this.jobPosition = jobPosition;
        if(this.jobPosition == ""){
            this.jobPosition = "Teknik IT";
        }
    }

    

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String newLastName){
        lastName = newLastName;
    }

    public String getJobPosition(){
        return jobPosition;
    }

    public void setJobPosition(String newJobPosition){
        jobPosition = newJobPosition;
        
    }

    

    @Override

    public String toString(){
        return "Name: " + this.name + " LastName " + this.lastName + " JobPosition " + this.jobPosition;
    }
}