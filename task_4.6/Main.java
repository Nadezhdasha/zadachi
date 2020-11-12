/*
Задача вывести на экран такое сообщение (для объекта gosha):
Меня зовут "имя объекта"
Имя моей мамы: "имя мамы"
Имя моего папы: "имя папы"
У меня две бабушки, бабушка "имя бабушки" и "имя бабушки"
У меня два деда, деда "имя деда" и "имя деда"
*/

 public class Main {
    public static void main(String[] args) {
        Person valera=new Person("Валера","Иванов",69,null,null);
        Person olga = new Person("Ольга","Иванова",67,null,null);
        Person oleg = new Person("Олег","Петров",65,null,null);
        Person jula = new Person("Юля","Петрова",67,null,null);
        Person alex = new Person("Алексей","Иванов",37,olga,valera);
        Person eva  = new Person("Ева","Иванова",37,jula,oleg);
        Person gosha= new Person("Гоша","Иванов",10,eva,alex);
        /*System.out.println("Мама Алексея: "+alex.getMother().getName());
        System.out.println("Бабушка Гоши: "+gosha.getMother().getMother().getName());*/
        gosha.getInfo();
    }
}
class Person{
    private String name;
    private String lastname;
    private int age;
    private int hp = 100;
    private Person mother;
    private Person father;
    public Person(String name, String lastname, int age, Person mother, Person father){
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.mother = mother;
        this.father = father;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public Person getFather() {
        return father;
    }
    public String getName() {
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public Person getMother(){
        return this.mother;
    }
    public void getInfo(){
        System.out.println("Меня зовут: " + this.name + "\n" +
                            "Имя моей мамы: " +this.getMother().getName() + "\n" +
                            "Имя моего папы: " +this.getFather().getName() + "\n" +
                            "У меня две бабушки, бабушка " +this.getMother().getMother().getName()+" и " + this.getFather().getMother().getName() + "\n" +
                            "У меня два деда, дед " +this.getMother().getFather().getName()+ " и дед " +this.getFather().getFather().getName());


}
}
