public abstract class Personaje {
    private String Nombre;
    private String Descripcion;
    private long Tamaño;
    private int Poder;
    private int Vida;



    public void desplazarse(){
        System.out.println("te desplazas");
    }
    public int mostrarVida(int vida){
        System.out.println("Tu vida es " + vida);
        return vida;
    }
    public void mostrarPoder(int poder){
        System.out.println("Tu vida es " + poder);
    }
}
