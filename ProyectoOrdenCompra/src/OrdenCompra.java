import java.util.Date;

public class OrdenCompra {
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];

    private static int ultimoId;
    private int indiceProductos;

    public OrdenCompra(String descripcion) {
        this.identificador = ++ultimoId;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public OrdenCompra addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }

        return this;
    }

    public int totalProductos() {
        int total = 0;

        for (Producto producto : this.productos) {
            if (producto != null) {
                total += producto.getPrecio();
            }
        }

        return total;
    }
}
