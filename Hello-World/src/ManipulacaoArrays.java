public class ManipulacaoArrays {

    public static void main(String[] args){
        int[] array = {1, 234, 987};
        /*int []array2 = {1, 234, 987};
        int array3[] = {1, 234, 987};
        System.out.println(array[2]);*/

        int[] array4 = new int[5];
        array4[0] = 2000;
        array4[1] = 2001;
        array4[2] = 2002;
        array4[3] = 2003;
        array4[4] = 2004;
        array4[1] = 1234;

        System.out.println(array4[1]);
    }
}
