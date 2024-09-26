public class CalcLogic{
    public float tambah(float angka1, float angka2){
        return angka1 + angka2;
    }
    public float kurang(float angka1, float angka2){
        return angka1 - angka2;
    }
    public float bagi(float angka1, float angka2){
        if(angka2 != 0) return angka1 / angka2;
        else{
            System.out.println("Tidak bisa membagi angka dengan 0");
            return 0;
        }
    }
    public float kali(float angka1, float angka2){
        return angka1 * angka2;
    }
}
