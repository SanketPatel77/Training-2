class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to java program");

        // swapping code
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        // array printing code

        int[] arr = { 1, 2, 3, 4, 5, 6 };
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}