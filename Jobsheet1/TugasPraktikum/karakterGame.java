package TugasPraktikum;

public class karakterGame {
    String name;
    int atk;
    int deff;
    int artefak;

    public void getName(String name) {
        this.name = name;
    }

    public void getAtk(int atk) {
        this.atk = atk;
    }

    public void getDef (int deff){
        this.deff = deff;
    }

    public void getArtefak (int atf){
        this.artefak = atf;
    }

    public void menyerang (int enemyDeff){
        if (atk > enemyDeff) {
            System.out.println("You win");
        } else if (atk < enemyDeff) {
            System.out.println("You Lose");
        }
    }

    public int bertahan (){
        return deff + artefak;
    }

    public void informasi() {
        System.out.println("Name : "+ this.name);
        System.out.println("Attack : "+ this.atk);
        System.out.println("Deffent : "+ this.deff);
        System.out.println("Artefak : "+ this.artefak);
    }

}
