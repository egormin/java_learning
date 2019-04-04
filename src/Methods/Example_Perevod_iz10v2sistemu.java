/* Chtobi perevesti chislo iz 10-i v 2-yu sistemu, nado chislo delit do teh por, poka ostatok ne stanet menshe 2
 a zatem vse ostatki zapisat v obratnom poryadke */

package Methods;

public class Example_Perevod_iz10v2sistemu {

    static void converter(int num) {
        int temp;

        temp = num % 2;

        if (num >= 2){
            converter(num / 2);
        }

        System.out.print(temp);

    }

    public static void main(String[] args) {
        int n = 650;

        converter(n);
    }
}

//1010001010
