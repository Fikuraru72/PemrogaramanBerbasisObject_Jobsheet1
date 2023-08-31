package TugasPraktikum;

public class demo {
    public static void main(String[] args) {
        
        Hanphone hp1 = new Hanphone();
        Tabloit hp2 = new Tabloit();
        SmartWatch hp3 = new SmartWatch();
        AlarmKebakaran alm = new AlarmKebakaran();
        AlarmKebakaran alm1 = new AlarmKebakaran();
        karakterGame game = new karakterGame();
        karakterGame game1 = new karakterGame();

        hp1.getMerek("Xiaomi");
        hp1.getNoHp(123456789);
        hp1.getEmail("barokah@Yahoo.co.id");

        hp2.getMerek("Samsung");
        hp2.getNoHp(314253641);
        hp2.getEmail(" ");
        hp2.getStylus(true);
        
        hp3.getMerek("Appel");
        hp3.getNoHp(0);
        hp3.getEmail("mamat@gamil.com");
        hp3.getSensor(60);

        alm.getApi(true);
        alm.getAsap(false);
       

        alm1.getApi(false);
        alm1.getAsap(true);
        

        game.getName("Arjuna");
        game.getAtk(7000);
        game.getDef(5000);
        game.getArtefak(200);

        game1.getName("Robin");
        game1.getAtk(5000);
        game1.getDef(6500);
        game1.getArtefak(300);


        // demons 



        System.out.println("Demo Class handphone");
        hp1.informasi();
        System.out.println("Menghubungi : "+ hp1.tlpn());
        System.out.println("Mengirim Email : " + hp1.kirimEmail());
        System.out.println("===================================");
        
        System.out.println("Demo Class Tablet");
        hp2.informasi();
        System.out.println("Menghubungi : "+ hp2.tlpn());
        System.out.println("Mengirim Email : " + hp2.kirimEmail());
        System.out.println("Menggambar : " + hp2.menggambar());
        System.out.println("===================================");

        System.out.println("Demo Class Smart Watch");
        hp3.informasi();
        System.out.println("Menghubungi : "+ hp3.tlpn());
        System.out.println("Mengirim Email : " + hp3.kirimEmail());
        System.out.println("detakJantung : " + hp3.bpm());
        System.out.println("===================================");

        System.out.println();

        System.out.println("Demo Class Alrm Kebakaran");
        System.out.println("kondisi Alrm 1 : ");
        alm.informasi();
        alm.deteksi();
        System.out.println("----------------------------------");
        System.out.println("kondisi Alrm 2 : ");
        alm1.informasi();
        alm1.deteksi();
        System.out.println("===================================");

        System.out.println();
        
        System.out.println("Demo class Karakter Game");
        game.informasi();
        System.out.printf("karakter %s atack karakter %s :\n", game.name, game1.name);
        game.menyerang(game1.bertahan());
        System.out.println("----------------------------------");
        game1.informasi();
        System.out.printf("karakter %s atack karakter %s :\n", game1.name, game.name);
        game1.menyerang(game.bertahan());

    }
}
