
public class Main {
    public static void main(String[] args) {
        String [] musicaPop = new String[3];
        String [] musicaRock = new String[1];


        Baladapop musicaPop1 = new Baladapop("Eleanor Rigby", "4 personas con instrumentos", "Canto pop");
        Rock musicaRock1 = new Rock("Come together", "Höfner");

        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(musicaPop[i]);

            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No hay modo de hacer eso");
        }finally{
            musicaPop[0] = musicaPop1.getNombre_musica();
            musicaPop[1] = musicaPop1.getPresentacionEscenario();
            musicaPop[2] = musicaPop1.getTipoCanto();
            System.out.println("\n\nMusica numero 1:");
            for (int i = 0; i < musicaPop.length; i++) {

                System.out.println(musicaPop[i]);

            }
        }





    }
}