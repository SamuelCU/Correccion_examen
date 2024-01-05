public class Rock extends GeneroMusical{
    String marcaGuitarra;

    public Rock(String nombre_musica, String marcaGuitarra) {
        super(nombre_musica);
        this.marcaGuitarra = marcaGuitarra;
    }

    public String getMarcaGuitarra() {
        return marcaGuitarra;
    }

    public void setMarcaGuitarra(String marcaGuitarra) {
        this.marcaGuitarra = marcaGuitarra;
    }

    public void reyRock (){
        System.out.println("El verdadero rey del Rock es: " +
                "Elvis Aaron Presley nació en 1935 en una familia humilde de Tupelo, Misisipí, Estados Unidos.");
    }

    @Override
    public void imprimirOrigen(){
        System.out.println("El origen del rock and roll se remonta a mediados del siglo XX, específicamente a principios de los años 50. " +
                "Este género musical se gestó a partir de la fusión de diferentes estilos como el blues, el folk y el rhythm and blues.");
    }
}
