public class Notboocks extends ProdInformaticos{

    private Double MemGb;

    public Notboocks(String nombreFabricante,Double MemGb) {
        super(nombreFabricante);
        this.MemGb=MemGb;
    }

    public Double getMemGb() {
        return MemGb;
    }

    public void setMemGb(Double memGb) {
        MemGb = memGb;
    }

    @Override
    public String toString() {
        return "Notboocks{" +
                "MemGb=" + MemGb +
                '}';
    }
}
