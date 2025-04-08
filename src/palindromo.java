public class palindromo {
    public static boolean verify(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int oposto = array.length - 1 - i;
            if (array[i] != array[oposto]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] dados = {7, 4, 9, 4, 7};
        boolean palindromo = verify(dados);
        System.out.println("Resultado: " + palindromo);
    }
}