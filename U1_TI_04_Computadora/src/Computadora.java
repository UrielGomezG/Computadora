public class Computadora {
    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca, String modelo, boolean encendida) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendida = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String marca) {
        this.modelo = marca;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender() {
        if(!encendida){
            encendida = true;
            System.out.println("Encendiendo ...");
        }
    }

    public void apagar() {
        if(encendida){
            encendida = false;
            System.out.println("Apagando ...");
        }
    }


}
