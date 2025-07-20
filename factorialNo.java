public  class factorialNo{
    public static void main(String[] args) {
        int num = 5,factorial=1;
        for(int i=1;i<=num;i++){
            factorial *=i;
        }
        System.out.println("Number"+num +"Factorial is:"+factorial);
    }
}