package caso03;
import java.util.ArrayList;
import java.util.Scanner;


public class SistemaVentas {

	private ArrayList<Producto> productos;
    private ArrayList<Venta> ventas;

    public SistemaVentas() {
        productos = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void registrarProducto(Producto p) {
        productos.add(p);
    }

    public void mostrarProductos() {
        System.out.println("\n--- Lista de productos ---");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + ". " + productos.get(i));
        }
    }

    public void realizarCompra(int index, int cantidad) {
        try {
            Producto p = productos.get(index);
            Venta v = new Venta(p, cantidad);
            ventas.add(v);
            System.out.println("✅ Compra realizada: " + v);
        } catch (Exception e) {
            System.out.println("⚠ Error en la compra: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SistemaVentas sistema = new SistemaVentas();
        Scanner sc = new Scanner(System.in);

        
        sistema.registrarProducto(new Producto("Laptop", 2500.0, 5));
        sistema.registrarProducto(new Producto("Mouse", 50.0, 10));
        sistema.registrarProducto(new Producto("Teclado", 120.0, 7));

        
        sistema.mostrarProductos();
        System.out.print("\nIngrese el índice del producto a comprar: ");
        int index = sc.nextInt();
        System.out.print("Ingrese cantidad: ");
        int cantidad = sc.nextInt();

        sistema.realizarCompra(index, cantidad);

        sc.close();
    }
}
