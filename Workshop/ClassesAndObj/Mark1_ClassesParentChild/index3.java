package ClassesAndObj.Mark1_ClassesParentChild;


    // MAIN Template for the Tower and Character
    class BasePlate {

        // Default attributes
        int Health;
        int Power;

        // Activity 2: Parent Method 1
        public void DisplayInfo(){
            System.out.println("\nHealth: " + Health + "\nPower: " + Power);
        }

        // Activity 2: Parent Method 2
        public void SoundEffect(){
            System.out.println("Sound Effects!");
        }

    }




    // TOWER class that inherits Attributes and Overrides Method from Parent
    class Tower extends BasePlate {

        // The 'special' Attribute
        int TowerNum;

        // Constructor
        public Tower(int num, int health, int power) {

            this.TowerNum = num;
            this.Health = health;
            this.Power = power;

        }

        // For telling if the Object is a Tower or the Base
        public String TowerOrBase(){

            if(TowerNum == 0){ // if TowerNum  is 0 then it returns 'Base' string for printing or other purposes
                return "Base";
            } else { // Returns 'Tower n' or for example 'Tower 1' if TowerNum is not 0
                return "Tower " + TowerNum;
            }

        }

        // Overrides display from Parent to fit for Object/Tower info
        @Override
        public void DisplayInfo() {

            System.out.println(TowerOrBase() + ":");

            System.out.println("* Health: " + Health);
            System.out.println("* Power: " + Power);

        }

        // Activity 2: Parent method gets overridden
        @Override
        public void SoundEffect(){

            System.out.println(TowerOrBase() + ": 'Shimmer...'"); // New Sound Effect

        }

    }



    // CHARACTER class that inherits Attributes and Overrides Method from Parent
    class Charc extends BasePlate {

        // The 'special' Attribute
        String Name;
        String Weapon;

        // Constructor
        public Charc(String name, String weapon, int health, int power) {

            this.Name = name;
            this.Weapon = weapon;
            this.Health = health;
            this.Power = power;

        }

        // Overrides display from Parent to fit for Character/Tower info
        @Override
        public void DisplayInfo() {

            System.out.println("\n" + Name + ":");
            System.out.println("* Health: " + Health);
            System.out.println("* Power: " + Power);
            System.out.println("* Weapon: " + Weapon);

        }

        // Activity 2: Parent method gets overridden
        @Override
        public void SoundEffect(){

            System.out.println(Name + ": 'Attack!'");

        }

    }






public class index3 {

    static void main(String[] args){

        // Object created with Child Class: TOWER
        BasePlate Tower1 = new Tower(0, 50, 5);

        // Object created with Child Class: CHARACTER
        BasePlate Saber = new Charc("Saber", "Sword", 30, 5);

        // Show info for Tower obj
        Tower1.DisplayInfo();
        Tower1.SoundEffect(); // Calls the sound effect that was overridden

        // Show info for Tower obj
        Saber.DisplayInfo();
        Saber.SoundEffect(); // Calls the sound effect that was overridden


    }

}
