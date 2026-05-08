package org.jesus.java.jdbc;

import org.jesus.java.jdbc.modelo.Categoria;
import org.jesus.java.jdbc.modelo.Producto;
import org.jesus.java.jdbc.servicio.CatalogoServicio;
import org.jesus.java.jdbc.servicio.Servicio;

import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalogoServicio();
        System.out.println("========== listar ==========");
        servicio.listar().forEach(System.out::println);
        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");

        Producto producto = new Producto();
        producto.setNombre("Lampara led escritorio");
        producto.setPrecio(990);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoConCategoria(producto, categoria);
        System.out.println("Producto guardado con éxito: " + producto.getId());
        servicio.listar().forEach(System.out::println);
    }
}
