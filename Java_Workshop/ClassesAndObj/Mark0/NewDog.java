package ClassesAndObj.Mark0;

public class NewDog {

    String DogName;
    int BitePower;




    public NewDog(String name, int bite){

        this.DogName = name;
        this.BitePower = bite;

    }




    public void Bark(int times){

        System.out.println("\n" + this.DogName + " Barks...");

        for(int i = 0; i < times; i++){

            System.out.print("Bark! ");

        }
        System.out.println();


    }




    public void LvlUp(){

        this.BitePower = this.BitePower + 1;

    }


}










