package Methods;

public class MainMethodOverload {
    public static void main(String[] args) {
        if (args.length > 0){                    // vhodnye parametry
            System.out.println(args[0]);         // Vyvesti 1-i parametr
        } else {
            main();    // Main without arguments
        }
    }

    public static void main(){
        System.out.println("Main without arguments");
    }
}
