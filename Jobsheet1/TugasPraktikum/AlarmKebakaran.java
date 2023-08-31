package TugasPraktikum;

public class AlarmKebakaran {
    private boolean sensorApi, sensorAsap;

    public void getApi(boolean api) {
        sensorApi = api;
    }

    public void getAsap(boolean asap) {
        sensorAsap = asap;
    }

    public void deteksi(){
        if (sensorApi == true) {
            alarm(1);
            memadamkan();
        } else if (sensorAsap == true ) {
            alarm(2);
        }
    }

    public void alarm(int condition){
        if (condition == 1) {
            System.out.println("Terjadi Kebakaran !!!!");
        } else if (condition == 2) {
            System.out.println("Terdeteksi Asap");
        }
    }

    public void memadamkan(){
        System.out.println("AIR...AIR...AIR");
    }

    public void informasi (){
        System.out.println("Sensor Api" + this.sensorApi);
        System.out.println("Sensor ASap" + this.sensorAsap);
    }


}
