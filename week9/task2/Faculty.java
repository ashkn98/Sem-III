package ashkn2;

class Faculty extends University {
    
    String fName;

    public Faculty(String fName, String uName, int ranking) {
        super(uName, ranking);
        this.fName = fName;
    }
    
    void Details() {
        System.out.println("----------------------------------------");
        System.out.println("University name: " + uName);
        System.out.println("University Ranking: " + ranking);
        System.out.println("----------------------------------------");
        System.out.println("Faculty name: " + fName);
    }
}
