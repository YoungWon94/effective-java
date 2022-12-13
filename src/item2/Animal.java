package item2;

/**
 * 공변 반환 타입
 */
public class Animal {

    public Animal copy() { return new Animal(); }

    public Number getNumber() { return 0; }

}

class Cat extends Animal {

    @Override
    public Cat copy() { return new Cat(); }

    @Override
    public Integer getNumber() { return 0; }

}

//공변 반환 타입 미적용
class Dog extends Animal {

    @Override
    public Animal copy() { return new Dog(); }

}


/* 인터페이스도 된다. */
interface Movable {
    Movable getPositionBeforeMoving();
}

class Car implements Movable {
    @Override
    public Car getPositionBeforeMoving() { return null; }
}