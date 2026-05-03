public class Loops {

    public static  void main(String[] args){
        int[] arraySimples = {1, 2 , 3, 4};

        for(int i = 0; i < arraySimples.length; i++){
            System.out.println(arraySimples[i]);
        }

        for (int numero : arraySimples){
            System.out.println(numero);
        }



        int a = 0;
        while (a < arraySimples.length){
            System.out.println(arraySimples[a]);
            a++;
        }

        int b = 0;

        do {
            System.out.println(arraySimples[b]);
            b++;
        }while (b < arraySimples.length);
    }
}
