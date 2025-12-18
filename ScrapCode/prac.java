import java.util.*;

class prac{
    public static void main(String[] args){
        test temp = new test();
        System.out.println(temp.i);
        temp.t[0] = new test();
        temp.t[0].setNum();
        System.out.println(temp.t[0].i);
    }

    public static class test{
        private test[] t;
        private int i;

        public test(){
            t = new test[5];
            i = 0;
        }
        public void setNum(){
            Random rand = new Random();
            i = rand.nextInt(100);
        }
    }
}