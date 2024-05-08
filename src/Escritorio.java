public class Escritorio extends ProductosOficina {
    private  Double alto;
    private Double largo;


    public Escritorio(Double alto, Double largo,Integer numStock,String nombre,Double precio) {
        super(numStock ,nombre,precio);
        this.alto = alto;
        this.largo=largo;
    }
    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }


    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", largo=" + largo +
                '}';
    }

    @Override
    public Double aplicardescuento() {
        return super.getPrecio()*1.10;
    }
}
