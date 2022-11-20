class Palindromo {

    public static boolean eh_palindromo(char[] palavra) {
        for (int i = 0, j = palavra.length - 1; i < palavra.length / 2; i++, j--) {
            if (palavra[i] != palavra[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[] array1 = new char[]{'a','n','a'};
        char[] array2 = new char[]{'c','a','s','a'};

        System.out.println(eh_palindromo(array1));
        System.out.println(eh_palindromo(array2));
    }

}
