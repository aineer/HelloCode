package lnterface_practice_002;

abstract class Botany {
    //定义抽象方法植物类
    abstract void Photosynthesis();
}
abstract class Carnivore {
    //定义抽象方法肉食动物类
    //每个肉食动物都要继承
    abstract void meat();
}
abstract class Herbivore {
    //定义抽象方法草食动物类
    //每个草食动物都要继承
    abstract void grass();
}
interface NeedSunshine {
    //扩展程序，是否需要阳光生存
    void Light();
}
interface Flight {
    //飞翔接口，扩展程序
    void flight();
}
interface Walk {
    //行走接口，扩展程序
    void walk();
}

class WildFlower extends Botany implements NeedSunshine {
    /**
     * 继承抽象Botany类，
     * 实现NeedSunshine接口
     */
    @Override
    public void Photosynthesis(){
        System.out.println("花有光合作用");
    }
    @Override
    public void Light() {
        System.out.println("花需要阳光生活");
    }
    public void WildFlowerIsAttribute() {
        System.out.println("我是一朵小小的野花");
    }
}

class Grass extends Botany implements NeedSunshine  {
    /**
     * 继承抽象Botany类，
     * 实现NeedSunshine接口
     */
    @Override
    public void Photosynthesis() {
        System.out.println("草有一点点光合作用");
    }
    @Override
    public void Light() {
        System.out.println("草需要阳光生活");
    }
    public void GrassIsAttribute() {
        System.out.println("我是一棵小小的草");
    }
}

class Dog extends Carnivore implements Walk, NeedSunshine {
    /**
     * 继承抽象Carnivore类，
     * 实现walk，NeedSunshine接口
     */
    @Override
    public void meat() {
        System.out.println("我是肉食动物");
    }
    @Override
    public void Light() {
        System.out.println("我需要阳光生活");
    }
    @Override
    public void walk() {
        System.out.println("我可以行走");
    }
    public void DogIsAttribute() {
        System.out.println("我是一只狗");
    }
}

class Bird extends Carnivore implements Flight, NeedSunshine {
    /**
     * 继承抽象Carnivore类，
     * 实现Flight，NeedSunshine接口
     */
    @Override
    public void meat() {
        System.out.println("我是肉食动物");
    }
    @Override
    public void Light() {
        System.out.println("我需要阳光生活");
    }
    @Override
    public void flight() {
        System.out.println("我可以飞翔");
    }
    public void BirdIsAttribute() {
        System.out.println("我是一只鸟");
    }
}

class Sheep extends Herbivore implements Walk, NeedSunshine {
    /**
     * 继承抽象Herbivore类，
     * 实现walk，NeedSunshine接口
     */
    @Override
    public void grass() {
        System.out.println("我是草食动物");
    }
    @Override
    public void Light() {
        System.out.println("我需要阳光生活");
    }
    @Override
    public void walk() {
        System.out.println("我可以行走");
    }
    public void BirdIsAttribute() {
        System.out.println("我是一只羊");
    }
}

class Main {
    public static void main(String[] args) {
        //main方法
        WildFlower flower = new WildFlower();
        flower.WildFlowerIsAttribute();
        flower.Photosynthesis();
        flower.Light();

        System.out.println();

        Grass grass = new Grass();
        grass.GrassIsAttribute();
        grass.Photosynthesis();
        grass.Light();

        System.out.println();

        Dog dog = new Dog();
        dog.DogIsAttribute();
        dog.Light();
        dog.meat();
        dog.walk();

        System.out.println();

        Bird bird = new Bird();
        bird.BirdIsAttribute();
        bird.flight();
        bird.Light();
        bird.meat();

        System.out.println();

        Sheep sheep = new Sheep();
        sheep.BirdIsAttribute();
        sheep.grass();
        sheep.walk();
        sheep.Light();
    }
}