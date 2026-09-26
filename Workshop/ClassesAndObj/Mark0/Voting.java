package ClassesAndObj.Mark0;

public class Voting {

    private String name;
    private int age;
    private int candi;



    public Voting(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    // Setter ni Matt
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setVote(int choCan){

        this.candi = choCan;

    }



    // Getter ni Matt
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean CheckAge() {
        return age >= 18;
    }

    public int getCan() {
        return this.candi;
    }

}






