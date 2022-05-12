package Counter;

public class Counter {

    public static void main(String[] args) {
        Counter counter2 = new Counter();
        Counter counter1 = new Counter(10);
        counter1.increase();
        counter2.increase();
        counter1.increase(2);
        counter2.increase(3);
        counter1.decrease(1);
        counter2.decrease(2);
        System.out.println(counter1.value());
        System.out.println(counter2.value());
    }

   int startValue;

   public Counter(int startValue){
       this.startValue = startValue;
   }

   public Counter(){
       startValue = 0;
   }

    public int value() {
        return startValue;
    }

    public void increase() {
       startValue = startValue + 1;
    }

    public void decrease(){
       startValue = startValue -1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            System.out.println("Value did not change");
        } else {
            startValue = startValue + increaseBy;
        }
    }

    public void decrease(int decreaseBy){
       if(decreaseBy < 0 ){
           System.out.println("Value did not change");
       } else {
           startValue = startValue - decreaseBy;
       }
    }
}
