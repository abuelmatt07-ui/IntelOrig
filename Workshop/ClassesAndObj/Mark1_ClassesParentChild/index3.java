package ClassesAndObj.Mark1_ClassesParentChild;

    class BasePlate {

        int Health;
        int Power;

        public void SoundEffect(){
            System.out.println("Sound Effects!");
        }

    }

    class Tower extends BasePlate {

        int TowerNum;

        public Tower(int num, int health, int power) {

            this.TowerNum = num;
            this.Health = health;
            this.Power = power;

        }
        public void ShowTowerInf() {

            if (TowerNum == 0) {
                System.out.println("\nBase:");
            } else {
                System.out.println("\nTower " + TowerNum + ":");
            }
            System.out.println("* Health: " + Health);
            System.out.println("* Power: " + Power);

        }

        @Override
        public void SoundEffect(){

            System.out.println("Tower " + TowerNum + ": 'Shimmer...'");

        }

    }

    class Charc extends BasePlate {

        String Name;
        String Weapon;

        public Charc(String name, String weapon, int health, int power) {

            this.Name = name;
            this.Weapon = weapon;
            this.Health = health;
            this.Power = power;

        }

        public void ShowCharcInfo() {

            System.out.println("\n" + Name + ":");
            System.out.println("* Health: " + Health);
            System.out.println("* Power: " + Power);
            System.out.println("* Weapon: " + Weapon);

        }

        @Override
        public void SoundEffect(){

            System.out.println(Name + ": 'Attack!'");

        }

    }






public class index3 {

    static void main(String[] args){

        Tower Tower1 = new Tower(6, 50, 5);
        Charc Saber = new Charc("Saber", "Sword", 30, 5);

        Tower1.ShowTowerInf();
        Tower1.SoundEffect();

        Saber.ShowCharcInfo();
        Saber.SoundEffect();


    }

}
