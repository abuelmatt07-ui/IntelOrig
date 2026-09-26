package ClassesAndObj.Mark1_ClassesParentChild;

    class BasePlate {

        int Health;
        int Power;

    }

    class Tower extends BasePlate {

        int TowerNum;

        public Tower(int num, int health, int power) {

            this.TowerNum = num;
            this.Health = health;
            this.Power = power;

        }
        public void ShowTowerInf() {

            if (this.TowerNum == 0) {
                System.out.println("\nBase:");
            } else {
                System.out.println("\nTower " + this.TowerNum + ":");
            }
            System.out.println("* Health: " + this.Health);
            System.out.println("* Power: " + this.Power);

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

            System.out.println("\n" + this.Name + ":");
            System.out.println("* Health: " + this.Health);
            System.out.println("* Power: " + this.Power);
            System.out.println("* Weapon: " + this.Weapon);

        }

    }





public class index3 {

    static void main(String[] args){

        Tower Tower1 = new Tower(0, 50, 5);
        Charc Saber = new Charc("Saber", "Sword", 30, 5);

        Tower1.ShowTowerInf();
        Saber.ShowCharcInfo();


    }

}
