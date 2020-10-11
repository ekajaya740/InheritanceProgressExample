//Subclass

public class DepanYamahan extends CharacterBase { //extends menandakan akses mengambil seluruh komponen dari superclass yang disebut di sampingnya
    
    public void depanYamahanStats(){
        namaCharacter = "Depan Yamahan";
        atkCharacter = 999;
        /*  ^
            Implementasi atribut yang dimiliki oleh superclass
            Superclass tidak menerima efek atas perubahan atribut ini
            sehingga superclass bisa digunakan oleh kelas lain.
        */
    }
    
}
