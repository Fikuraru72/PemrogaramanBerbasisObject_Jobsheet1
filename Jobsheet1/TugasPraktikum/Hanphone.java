package TugasPraktikum;

public class Hanphone {
    private String merek;
    private long noHp;
    private String email;


    public void getMerek(String merek) {
        this.merek = merek;
    }

    public void getNoHp(long noHp) {
        this.noHp = noHp;
    }

    public void getEmail (String email){
        this.email = email;
    }

    public boolean tlpn (){
        if (noHp != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean kirimEmail (){
        if (email != " ") {
            return true;
        } else {
            return false;
        }
    }

    public void informasi (){
        System.out.println("Merek : "+ this.merek);
        System.out.println("No Hanphone : "+ this.noHp);
        System.out.println("Email : "+ this.email);
    }
}