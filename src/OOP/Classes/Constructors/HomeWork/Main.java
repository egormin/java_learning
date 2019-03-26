package OOP.Constructors.HomeWork;

public class Main {
    /*
    Sozdat klass Rabotnik, v kotorom budet 3 polia: imia, dolzhnost i zarplata. V konstruktore s paraetrami proinitsializirovat vse polia
    Dobavit metod s parametrom int, kotoriy vozvraschaet String - informatsiyu o sotrudnike, a takzhe summu
    zarplaty kotoruyu on poluchil za i mesiatsev (i peredaetsia v kachestve perametra).
    Prodemonstrirovat rabotu v klasse main
     */
    public static void main(String[] args) {
        Rabotnik employee = new Rabotnik("Ivan", "developer",5000);

        String info = employee.getInfo(12);
        System.out.println(info);
    }
}
