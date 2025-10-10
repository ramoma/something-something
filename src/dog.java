import java.util.Random;

public class dog {

    public static Random rand = new Random();
    String name;
    int age;
    String breed;
    
    dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void speak(){
        String[] speak = {"borf", "bark","woof","aw","grrrrrr","awooooooooooo"};
        int dialogue = rand.nextInt(0,5);
        System.out.println(speak[dialogue]);
    }

}
