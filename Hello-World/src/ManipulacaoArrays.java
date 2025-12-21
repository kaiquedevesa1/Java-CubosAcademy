public class ManipulacaoArrays {

    public static void main(String[] args){
        int[] array = {1, 234, 987};
        int []array2 = {1, 234, 987};
        int array3[] = {1, 234, 987};
        System.out.println(array[2]);

        int[] array4 = new int[5];
        array4[0] = 2000;
        array4[1] = 2001;
        array4[2] = 2002;
        array4[3] = 2003;
        array4[4] = 2004;
        array4[1] = 1234;

        System.out.println(array4[1]);


        //ArrayMultimensional

        String [][] arrayMultimensional = {{"Pedro" , "Joao"}, {"Maria", "Antonia"}};
        System.out.println(arrayMultimensional[1][1]);
        System.out.println(arrayMultimensional[0][1]);

        int[][] arrayMultimensional2 = new int [2][2];
        arrayMultimensional2 [0][0] = 1;
        arrayMultimensional2 [0][1] = 2;
        arrayMultimensional2 [1][0] = 3;
        arrayMultimensional2 [1][1] = 4;



        System.out.println(arrayMultimensional2[1][2]);
    }
}
