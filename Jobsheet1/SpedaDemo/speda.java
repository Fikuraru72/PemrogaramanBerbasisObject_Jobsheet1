package SpedaDemo;

public class speda {
    private String merek;
    private int kecepatan;
    private int gear;
    public int jarak, jangkauan;

    public void setMerek (String newValue){
        merek = newValue;
    }

    public void gantiGear (int newValue){
        gear = newValue;
    }

    public void tambahKecepatan (int increment){
        kecepatan = increment;
    }

    public void rem (int decrement){
        kecepatan = kecepatan - decrement;
    }

    public void cetakStatus (){
        System.out.println("Merek : "+ merek);
        System.out.println("Kecepatan : "+ kecepatan);
        System.out.println("Gear : "+ gear);
    }

    
}