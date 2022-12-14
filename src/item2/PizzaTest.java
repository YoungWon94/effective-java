package item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public class PizzaTest {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.ONION)
                .build();
    }
}

abstract class Pizza {

    public enum Topping { HAM, MUSHROOM, ONION }
    final Set<Topping> toppings;

    //생성자
    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

    //빌더 - 추상 클래스는 빌더도 추상으로 만든다.
    abstract static class Builder<T extends Builder<T>> { //제네릭 저 부분이 "재귀적 타입 한정" 이라는 것
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        //하위 클래스는 이 메서드를 재정의하여 "this"를 반환하도록 해야 한다.
        protected abstract T self();
    }
}

class NyPizza extends Pizza {

    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    //생성자
    public NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    //빌더
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        //공변 반환 타입
        @Override
        NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}

