public class Mamifero {
    public String name;
    public String color;
    public String tipo;
    public int tamanio;

    private int edadMaximo;

    public double peso;

    public String getName(){
        return name;
    }
    public void setName(String _name){
        this.name= _name;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String _color){
        this.color = _color;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String _tipo){
        this.tipo= _tipo;
    }
    public int getTamanio(){
        return tamanio;
    }
    public void setTamanio(int _tamanio){
        this.tamanio= _tamanio;
    }
    public int getEdadMaximo(){
        return edadMaximo;
    }
    public void setEdadMaximo(int _edadMaximo){
        this.edadMaximo= _edadMaximo;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double _peso){
        this.peso = _peso;
    }

    public Mamifero(String _name, String _color, String _tipo, int _tamanio, int _edadMaximo, double _peso){
        this.name = _name;
        this.color = _color;
        this.tipo = _tipo;
        this.tamanio = _tamanio;
        this.edadMaximo = _edadMaximo;
        this.peso = _peso;
    }
}
