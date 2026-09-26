package ClassesAndObj.Mark1_ClassesParentChild;


    // MAIN Template for the Tower and Character
    class BasePlate {

        // Default attributes
        int Health;
        int Power;

        // Activity 2: Parent Method
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

        // Displays Object/Tower info
        public void ShowTowerInf() {

            // If the object is numbered as 0, then it is the main/base
            if (TowerNum == 0) {
                System.out.println("\nBase:");
            }

            // Else if tower in not numbered as 0, which just displays the object as a normal tower
            else {
                System.out.println("\nTower " + TowerNum + ":");
            }

            System.out.println("* Health: " + Health);
            System.out.println("* Power: " + Power);

        }

        // Activity 2: Parent method gets overridden
        @Override
        public void SoundEffect(){

            System.out.println("Tower " + TowerNum + ": 'Shimmer...'"); // New Sound Effect

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

        // Displays Object/Chracter info
        public void ShowCharcInfo() {

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
        Tower Tower1 = new Tower(6, 50, 5);

        // Object created with Child Class: CHARACTER
        Charc Saber = new Charc("Saber", "Sword", 30, 5);

        // Show info for Tower obj
        Tower1.ShowTowerInf();
        Tower1.SoundEffect(); // Calls the sound effect that was overridden

        // Show info for Tower obj
        Saber.ShowCharcInfo();
        Saber.SoundEffect(); // Calls the sound effect that was overridden


    }

}
