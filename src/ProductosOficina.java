public abstract  class ProductosOficina {
    private Integer numStock;
    private String nombre;
    private Double precio;



    public Double getPrecio() {
        return precio;
    }

    public ProductosOficina(Integer numStock,String nombre,Double precio) {
        this.numStock = numStock;
        this.nombre=nombre;
        this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }



    public Integer getNumStock() {
        return numStock;
    }



    public abstract Double aplicardescuento();


}
