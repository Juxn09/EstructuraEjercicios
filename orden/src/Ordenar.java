import java.util.Arrays;

public class Ordenar {
    public static void is(int [] v) {
        int aux;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if(v[j]> v[j+1]){
                    aux= v[j];
                    v[j]= v[j+1];
                    v[j+1]= aux;
                }

            }

        }
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {
        int[] a = new int[]{5,3,8,1,2};
        is(a);
    }

}
