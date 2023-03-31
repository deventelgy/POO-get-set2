public class Main {
    public static void main(String[] args)
    {
        Mamifero mamifero = new Mamifero("vaca","blanco","",3,5,1200.5);
        Mamifero mamifero2 = new Mamifero("vaca","Negro","",3,5,1200.5);

        System.out.println("Datos antiguos son:\n");
        System.out.println("=====================");
        System.out.println("Nombre = "+mamifero.getName());
        System.out.println("Color ="+mamifero.getColor());
        System.out.println("Tipo = "+mamifero.getTipo());
        System.out.println("Tamaño = "+mamifero.getTamanio());
        System.out.println("Edad maximo = "+mamifero.getEdadMaximo());
        System.out.println("Peso = "+mamifero.getPeso());

        mamifero.setTipo("Terrestre");
        mamifero2.adicional(2); // adicionando para la variable edadMaximo

        System.out.println("\nDatos actualizados son");
        System.out.println("=====================");
        System.out.println("Nombre = "+mamifero.getName());
        System.out.println("Color ="+mamifero.getColor());
        System.out.println("Tipo = "+mamifero.getTipo());
        System.out.println("Tamaño = "+mamifero.getTamanio());
        System.out.println("Edad maximo = "+mamifero.getEdadMaximo());
        System.out.println("Peso = "+mamifero.getPeso());
        //System.out.println("Edad maximo de Mamifero2: "+mamifero2.getEdadMaximo());
        //System.out.println("Edad maximo de Mamifero2 con mamifero2.edadMaximo() "+edadMaximo);
        System.out.println("Edad maximo adicionado : "+mamifero2.edadMaximo);
    }
}