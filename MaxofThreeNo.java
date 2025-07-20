public  class MaxofThreeNo{
public static void main(String[] args) {
    int a=34,b=78,c=25,max;
    if(a>=b&&a>=c){
        max=a;
    }else if(b>=a&&b>c){
        max=b;
    }else{
        max=c;
    }
    System.out.println("max is:"+max);
  }
}