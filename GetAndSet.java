public class GetAndSet {
    private int a;
    int b;

    public String getName() {
        return name;
    }

    public void setName(String Nam) {
        this.name = Nam;
    }

    private  String name;
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class Demo2{
    public static void main(String[] args) {
        GetAndSet t = new GetAndSet();
        t.setA(500);
        System.out.println(t.getA());
        t.setName("Rahul");
        System.out.println(t.getName());
    }
}