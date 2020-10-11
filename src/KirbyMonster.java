//Subclass

public class KirbyMonster extends CharacterBase { //extends menandakan akses mengambil seluruh komponen dari superclass yang disebut di sampingnya
    
    public void kirbyMonsterStats(){
        namaCharacter = "Kirby Monster";
        atkCharacter = 100;
        /*  ^
            Implementasi atribut yang dimiliki oleh superclass
            Superclass tidak menerima efek atas perubahan atribut ini
            sehingga superclass bisa digunakan oleh kelas lain.
        */
    }

}
