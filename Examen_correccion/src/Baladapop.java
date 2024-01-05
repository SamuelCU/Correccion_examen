public class Baladapop extends Pop{
    String tipoCanto;

    public Baladapop(String nombre_musica, String presentacionEscenario, String tipoCanto) {
        super(nombre_musica, presentacionEscenario);
        this.tipoCanto = tipoCanto;
    }

    public String getTipoCanto() {
        return tipoCanto;
    }

    public void setTipoCanto(String tipoCanto) {
        this.tipoCanto = tipoCanto;
    }

    public void grupoPrincipal(){
        System.out.println("EL grupo mas representativo: Los Beatles son uno de los grupos más populares de todos los tiempos.");
    }

    @Override
    public void imprimirOrigen(){
        System.out.println("Se origina en los Estados Unidos, tras la comercialización de los discos en la década de 1920, " +
                "cuando deciden llamar \"Ballad\" a los temas lentos de temática romántica, su aparición se debe a una cultura " +
                "floreciente causada por las migraciones de Europa hacia América a causa de la primera guerra mundial.");
    }
}
