public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Teller til ti");
        for (int i =0; i<=10; i++){
            System.out.println(i);
        }
    }

    public int maks(int a[]){
        int maks = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] > maks){
                maks = a[i];
            }
        }
        return maks;
    }
}
