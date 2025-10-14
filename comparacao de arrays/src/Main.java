import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{1, 4, 3};

        String[] names=new String[5];
        Arrays.fill(names,"Desconhecido");
        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.equals(numbers,numbers2));
    }
}