class Animal{
    public void sound(){
        System.out.println("Sound of animal.");
    }
}

class Bird extends Animal
{
    public void sound(){
        System.out.println("Sound of bird.");
    }
}

class Cat extends Animal
{
    public void sound(){
        System.out.println("Sound of Cat.");
    }
}

class Sound extends Animal
{
    public void check(Animal ref){
        ref.sound();
        System.out.println("......................");
    }
}

class PolysmDemo{
    public static void main(String args[]){
        Animal ref=new Animal();

        Bird b=new Bird();

        Cat c=new Cat();

        Sound s=new Sound();
        s.check(ref);
        s.check(b);
        s.check(c);


    }
}