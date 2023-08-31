package TugasPraktikum;

public class Tabloit extends Hanphone {
    private boolean stylusPen ;

    public void getStylus(boolean stylus) {
        this.stylusPen = stylus;
    }

    public boolean menggambar (){
        if (stylusPen == true) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        super.informasi();
        System.out.println("Stylus Pen : "+ this.stylusPen);
    }
}
