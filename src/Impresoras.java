public class Impresoras extends ProdInformaticos implements Descuento{
    private Integer numImpresionXmin;

    public Impresoras(String nombreFabricante, Integer numImpresionesXmin) {
        super(nombreFabricante);
        this.numImpresionXmin=numImpresionesXmin;
    }

    public Integer getNumImpresionXmin() {
        return numImpresionXmin;
    }

    public void setNumImpresionXmin(Integer numImpresionXmin) {
        this.numImpresionXmin = numImpresionXmin;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "numImpresionXmin=" + numImpresionXmin +
                '}';
    }

    @Override
    public Double descuento(Double porc) {
        return super.getPrecio()*1.05;
    }
}
