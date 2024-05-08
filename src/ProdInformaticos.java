public class ProdInformaticos extends ProductosOficina{

    private String nombreFabricante;

    public ProdInformaticos(Integer numStock, String nombre, Double precio, String nombreFabricante) {
        super(numStock, nombre, precio);
        this.nombreFabricante = nombreFabricante;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }



    @Override
    public Double aplicardescuento() {
        return super.getPrecio()*1.2;
    }
}
