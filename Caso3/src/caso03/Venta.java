package caso03;
import java.util.Date;

public class Venta {

	private Producto producto;
    private int cantidad;
    private double total;
    private Date fecha;

    public Venta(Producto producto, int cantidad) throws Exception {
        this.producto = producto;
        this.cantidad = cantidad;
        producto.disminuirStock(cantidad);
        this.total = cantidad * producto.getPrecio();
        this.fecha = new Date();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Venta de " + cantidad + " x " + producto.getNombre() +
               " | Total: " + total + " | Fecha: " + fecha;
    }
}
