package ClassesAndObj.Mark0;

public class index {

    static void main(String[] args){

        NewDog matt = new NewDog("Colin", 10);

        matt.Bark(5);

        matt.LvlUp();


        System.out.println("---------------------------------");

        System.out.println(matt.DogName + " leveled up to " + matt.BitePower + "!");



    }


}
