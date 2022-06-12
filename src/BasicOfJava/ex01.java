package BasicOfJava;

public class ex01 {
    public static void main(String[] args) {

    }

    class Box<T> {
        // 지네릭 클래스스
       // T == 타입변수(Type Variable)
        T item;

        void setItem(T item){
            this.item = item;
        }

        T getItem() {
            return item;
        }

    }
}
