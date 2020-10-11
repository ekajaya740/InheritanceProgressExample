//Superclass

public class CharacterBase {
    protected String namaCharacter;
    protected int atkCharacter;
    /*  ^
        Berisi atribut dasar yang diperlukan oleh subclass
    */

    public void menyerang(){
        System.out.println(this.namaCharacter + " menyerang dengan serangan sebesar " + this.atkCharacter);
    }
    /*  ^
        Bisa juga berisi sebuah method
    */
}
