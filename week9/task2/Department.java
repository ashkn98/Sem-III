package ashkn2;

class Department extends Faculty{
    
    String dName;
    String chairman;

    public Department(String dName, String chairman, String fName, String uName, int ranking) {
        super(fName, uName, ranking);
        this.dName = dName;
        this.chairman = chairman;
    }
    
    void Details() {
        System.out.println("----------------------------------------");
        System.out.println("Department name: " + dName);
        System.out.println("Department chairman: " + chairman);
    }
    
    void Display() {
        super.Details();
        this.Details();
    }
}
