public class ClassLevelGeneric <T> {
    T a;
    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
}
class Demo1 {
    public static void main(String[] args) {
        //By Using ClassLevel Method We can use any Data type with the one instance variable
        ClassLevelGeneric Result = new ClassLevelGeneric<Integer>(); //By Using INTEGER
        ClassLevelGeneric Result1 = new ClassLevelGeneric<String>();  //By Using String
        Result.setA(50);
        Result1.setA("Rahul");
        System.out.println(Result.getA());
        System.out.println(Result1.getA());
    }
}
