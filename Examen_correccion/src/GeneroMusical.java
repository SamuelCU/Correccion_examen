public class GeneroMusical {
    String nombre_musica, instrumento_principal, tempo;

    public GeneroMusical(String nombre_musica){
        this.nombre_musica = nombre_musica;
    }

    public String getNombre_musica() {
        return nombre_musica;
    }

    public void setNombre_musica(String nombre_musica) {
        this.nombre_musica = nombre_musica;
    }

    public String getInstrumento_principal() {
        return instrumento_principal;
    }

    public void setInstrumento_principal(String instrumento_principal) {
        this.instrumento_principal = instrumento_principal;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public void imprimirOrigen(){
        System.out.println("El origen de la música se encuentra cubierto de misterio, aunque se estima comenzó en " +
                "la prehistoria de la humanidad y se lo vincula con los ritos de apareamiento y con el trabajo colectivo. " +
                "La danza y el canto parecen haber estado desde el principio asociados al modo en que el ser humano comprende el mundo.");
    }
}
