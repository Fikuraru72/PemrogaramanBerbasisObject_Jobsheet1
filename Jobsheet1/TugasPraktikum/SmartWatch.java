package TugasPraktikum;


public class SmartWatch extends Hanphone{

    public int senJantung;

    public void getSensor(int sen) {
        this.senJantung = sen;
    }

    public int bpm (){
        return senJantung;
    }

    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        super.informasi();
        System.out.println("Detak Jantung : "+senJantung+" Bpm");
    }
    
}