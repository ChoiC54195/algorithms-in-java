package BasicOfJava;

public class ex01 {
    public static void main(String[] args) {

    }

    class Box<T> {
        // ���׸� Ŭ������
       // T == Ÿ�Ժ���(Type Variable)
        T item;

        void setItem(T item){
            this.item = item;
        }

        T getItem() {
            return item;
        }

    }
}
