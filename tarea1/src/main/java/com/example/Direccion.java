public class Direccion {
    private String Direccion;
    public void Direccion (String A){
        Direccion=A;
    }
    public String getDIR() {
        return Direccion;
    }
    public void setDIR (String A) {
        this.Direccion=A;
    }
    public String  toString () {
        return "direccion: " +this.Direccion;
    }

}
