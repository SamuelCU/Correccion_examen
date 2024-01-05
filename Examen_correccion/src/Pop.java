public class Pop extends GeneroMusical{
    String presentacionEscenario;

    public Pop(String nombre_musica, String presentacionEscenario) {
        super(nombre_musica);
        this.presentacionEscenario = presentacionEscenario;
    }

    public String getPresentacionEscenario(){
        return presentacionEscenario;
    }

    public void setPresentacionEscenario(String presentacionEscenario){
        this.presentacionEscenario = presentacionEscenario;
    }

    public void reyPop(){
        System.out.println("Michael Joseph Jackson (Gary, Indiana, 29 de agosto de 1958-Los Ángeles, 25 de junio de 2009)1\u200B " +
                "fue un cantante, compositor, productor y bailarín estadounidense.2\u200B3\u200B4\u200B" +
                " Apodado como el «Rey del Pop»,5\u200B sus contribuciones y reconocimiento en la historia de la música y " +
                "el baile durante más de cuatro décadas, así como su publicitada vida personal, lo convirtieron en una " +
                "figura internacional en la cultura popular.");
    }

    @Override
    public void imprimirOrigen(){
        System.out.println("El pop nace como género musical a mitad de la década de los 50 en Reino Unido y Estados Unidos. " +
                "Aunque es cierto que unas décadas antes, en concreto en 1926, se comenzaron a utilizar las primeras expresiones " +
                "referentes de popular music.");
    }

}
