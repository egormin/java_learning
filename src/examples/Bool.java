public class Bool {
    public static void main(String[] args) {
        int temp = 26;


        if(temp > 25){
            System.out.println("Кондиционер включен");
        }

        temp = 26;

        boolean hot = temp > 25;

        if(hot ){
            System.out.println("Кондиционер включен");
        }

        temp = 20;
        hot = temp > 25;

        if(!hot ){
            System.out.println("Кондиционер выключен");
        }

        if (25 == 25){
            System.out.println("Равно");
        }

        //  Кондиционер включен
        //  Кондиционер включен
        //  Кондиционер выключен

        temp = 40;
        hot = temp > 25;
        int time = 24;
        boolean late = time >= 23;

        if (!hot || late){  //false || true = true
            System.out.println("Кондиционер выключен");
        }
         //Хоть и жарко, но поздно, поэтому выключен

        if (!hot && late){  //false && true = false
            System.out.println("Кондиционер выключен");
        }

        // Home work
        int time1 = 17;
        boolean late1 = time1 >= 23 || time1 <= 5;
        boolean night = late1;
        boolean goodWeather = true;

        if (night) {
            System.out.println("Sleep");
        }

        if (!night && goodWeather){
            System.out.println("Go for a walk");
        }

        if (!night && !goodWeather){
            System.out.println("Read a book");
        }
        //Go for a walk

        //Ternary
        int one = 10;
        int two = 20;
        String msg = one >= two ? "Number one greater than two" : "Number one less than or equal to two";
        System.out.println(msg); // Number one less than or equal to two
    }
}
