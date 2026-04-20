import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EjemploOrdenes {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Cliente cliente1 = new Cliente("Jesus", "Pereira");
        Cliente cliente2 = new Cliente("Lalo", "Mena");
        Cliente cliente3 = new Cliente("Juan", "Jr");

        OrdenCompra ordenCompra1 = new OrdenCompra("Compra n° 1");
        OrdenCompra ordenCompra2 = new OrdenCompra("Compra n° 2");
        OrdenCompra ordenCompra3 = new OrdenCompra("Compra n° 3");

        ordenCompra1.setCliente(cliente1);
        ordenCompra2.setCliente(cliente2);
        ordenCompra3.setCliente(cliente3);

        Producto producto1 = new Producto("TechNova", "Smartphone X1", 299990);
        Producto producto2 = new Producto("ElectroMax", "Televisor 50\" UHD", 449990);
        Producto producto3 = new Producto("SoundPro", "Audífonos Bluetooth", 59990);
        Producto producto4 = new Producto("GameCore", "Consola GX", 399990);
        Producto producto5 = new Producto("HomeTech", "Aspiradora Inteligente", 189990);
        Producto producto6 = new Producto("KitchenPlus", "Licuadora TurboMix", 49990);
        Producto producto7 = new Producto("CoolAir", "Aire Acondicionado 12000 BTU", 329990);
        Producto producto8 = new Producto("FitLife", "Smartwatch Active", 79990);
        Producto producto9 = new Producto("NoteMaster", "Notebook Pro 14\"", 799990);
        Producto producto10 = new Producto("PrintFast", "Impresora Láser", 129990);
        Producto producto11 = new Producto("VisionTech", "Monitor 27\" Full HD", 179990);
        Producto producto12 = new Producto("ChargeUp", "Power Bank 20000mAh", 29990);

        ordenCompra1.addProducto(producto1)
                .addProducto(producto2)
                .addProducto(producto3)
                .addProducto(producto4);

        ordenCompra2.addProducto(producto5)
                .addProducto(producto6)
                .addProducto(producto7)
                .addProducto(producto8);

        ordenCompra3.addProducto(producto9)
                .addProducto(producto10)
                .addProducto(producto11)
                .addProducto(producto12);

        System.out.println("Primera orden:");
        System.out.println("Identificador: " + ordenCompra1.getIdentificador() + "\nDescripción: " + ordenCompra1.getDescripcion() + "\nCliente: "
                + ordenCompra1.getCliente().getNombre() + " " + ordenCompra1.getCliente().getApellido() + "\nFecha: " + df.format(ordenCompra1.getFecha()));

        System.out.println("Productos:");
        for (int i = 0; i < ordenCompra1.getProductos().length; i++) {
            System.out.println("\t- " + ordenCompra1.getProductos()[i].getNombre() + " " +
                    ordenCompra1.getProductos()[i].getFabricante() +
                    "  $" + ordenCompra1.getProductos()[i].getPrecio());
        }

        System.out.println("Total: $" + ordenCompra1.totalProductos());

        System.out.println();
        System.out.println();

        System.out.println("Segunda orden:");
        System.out.println("Identificador: " + ordenCompra2.getIdentificador() + "\nDescripción: " + ordenCompra2.getDescripcion() + "\nCliente: "
                + ordenCompra2.getCliente().getNombre() + " " + ordenCompra2.getCliente().getApellido() + "\nFecha: " + df.format(ordenCompra2.getFecha()));

        System.out.println("Productos:");
        for (int i = 0; i < ordenCompra2.getProductos().length; i++) {
            System.out.println("\t- " + ordenCompra2.getProductos()[i].getNombre() + " " +
                    ordenCompra2.getProductos()[i].getFabricante() +
                    "  $" + ordenCompra2.getProductos()[i].getPrecio());
        }

        System.out.println("Total: $" + ordenCompra2.totalProductos());

        System.out.println();
        System.out.println();

        System.out.println("Tercera orden:");
        System.out.println("Identificador: " + ordenCompra3.getIdentificador() + "\nDescripción: " + ordenCompra3.getDescripcion() + "\nCliente: "
                + ordenCompra3.getCliente().getNombre() + " " + ordenCompra3.getCliente().getApellido() + "\nFecha: " + df.format(ordenCompra3.getFecha()));

        System.out.println("Productos:");
        for (int i = 0; i < ordenCompra3.getProductos().length; i++) {
            System.out.println("\t- " + ordenCompra3.getProductos()[i].getNombre() + " " +
                    ordenCompra3.getProductos()[i].getFabricante() +
                    "  $" + ordenCompra3.getProductos()[i].getPrecio());
        }

        System.out.println("Total: $" + ordenCompra3.totalProductos());
    }
}
