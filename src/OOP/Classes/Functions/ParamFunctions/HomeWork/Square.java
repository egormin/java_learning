package OOP.Functions.ParamsFunctions.HomeWork;

public class Square {

    int dlina;
    int shirina;

    void setSize(int dlina, int shirina) {
        this.dlina = dlina;
        this.shirina = shirina;
    }

    int getPerim() {
        return dlina * 2 + shirina * 2;
    }

    int getSquare(){
        return dlina * shirina;
    }
}
