public class GenericsMethodLevel {
    <T>void print(T[] Value){
        for (int i=0; i< Value.length; i++)
            System.out.print(Value[i]+ " ");
        System.out.println(Value.length);
    }
}
class Demo {
    public static void main(String[] args) {
        Integer [] number = {10,12,15};
        Double [] num = {10.5,12.6,11.3};
        Character [] chars = {'A','B','C','D'};
        GenericsMethodLevel Result = new GenericsMethodLevel();
        Result.print(number);
        System.out.println();
        Result.print(num);
        System.out.println();
        Result.print(chars);
        System.out.println(number.length);
    }
}