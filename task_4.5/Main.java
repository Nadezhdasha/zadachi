Создать абстрактный класс Animal с характеристиками животного.
Создать класс Horse который наследуется от Animal, в классе Horse реализовать метод public void run(){ System.out.println("Игого, я поскакал(а)"); }
Создать класс Pegasus который наследуется от Horse, в классе Pegasus реализовать метод public void fly(){ System.out.println("Игого, я полетел(а)"); }
Создать объект лошади и вызвать метод run();
Создать объект пегаса и вызвать метод fly();


public class Main{
    public static void main(String[] args) {

        Hers loshadka = new Herse (nikname "Лошадка");
        loshadka.voice();
        Pegasus pega = new Pegasus(nikname "Пега")
        pega.voice();
   class Animal implements AnimalInterface{
   String nikname;

   public Animal(String nikname)

class Herse extends Animal{
       public Herse(String nikname) {
           super(nikname);
       }
           public void run() {
        System.out.println("Игого, я поскакала");
    }

        class Pegasus extends Herse{
               public Pegasus(String nikname){
                   super(nikname);
               }
            public void fly(){
            System.out.println("Игого, я полетела");
      }

        }

    }
}
