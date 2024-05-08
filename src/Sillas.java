public class Sillas extends ProductosOficina implements Descuento{
    private Integer numRuedas;

    public Sillas(Integer numStock, String nombre, Double precio,Integer numRuedas) {
        super(numStock, nombre, precio);
        this.numRuedas=numRuedas;

    }

    public void setNumRuedas(Integer numRuedas) {
        this.numRuedas = numRuedas;
    }

    public Integer getNumRuedas() {
        return numRuedas;
    }





    @Override
    public Double aplicardescuento() {
        return null;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "numRuedas=" + numRuedas +
                '}';
    }

    @Override
    public Double descuento(Double porc) {
        return null;
    }
}
