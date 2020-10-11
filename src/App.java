public class App {
    public static void main(String[] args) {

        KirbyMonster kirbyMonster = new KirbyMonster(); //Deklarasi objek class KirbyMonster
        kirbyMonster.kirbyMonsterStats(); /*Menjalankan method stats agar data yang ada di update
                                            Tanpa hal ini data tidak diupdate sehingga mengeluarkan nilai 0*/
        System.out.println("Nama Monster: " + kirbyMonster.namaCharacter); 
        System.out.println("Kekuatan serangan: " + kirbyMonster.atkCharacter);

        kirbyMonster.menyerang(); //Method dari superclass yang diakses oleh subclass lalu dijalankan oleh main

        System.out.println();

        DepanYamahan depanYamahan = new DepanYamahan(); //Deklarasi objek class DepanYamahan
        depanYamahan.depanYamahanStats(); /*Menjalankan method stats agar data yang ada di update
                                            Tanpa hal ini data tidak diupdate sehingga mengeluarkan nilai 0*/
        System.out.println("Nama Monster: " + depanYamahan.atkCharacter);
        System.out.println("Kekuatan serangan: " + depanYamahan.atkCharacter);

        depanYamahan.menyerang(); //Method dari superclass yang diakses oleh subclass lalu dijalankan oleh main
    }
}
