package SpedaDemo;

public class SepedaGunung extends speda {
    private String tipeSuspensi;

    public void setTipeSuspensi (String newValue){
        tipeSuspensi = newValue;
    }

    public void cetakStatus (){
        super.cetakStatus();
        System.out.println("Tipe Suspensi : "+ tipeSuspensi);
    }
}
