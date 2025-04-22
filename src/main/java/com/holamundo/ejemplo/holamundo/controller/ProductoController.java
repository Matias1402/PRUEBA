package com.holamundo.ejemplo.holamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/v2")
public class ProductoController {

    @GetMapping("/productos")
    public String index(){
        return "Bienvenido, este es el listado de productos";
    }
    private List<ArrayList<Object>> productos = new ArrayList<>();


    public ProductoController() {

        ArrayList<Object> producto1 = new ArrayList<>();
        producto1.add(1);
        producto1.add("Computador");
        producto1.add(799.99);

        ArrayList<Object> producto2 = new ArrayList<>();
        producto2.add(2);
        producto2.add("Telefono");
        producto2.add(499.99);

        ArrayList<Object> producto3 = new ArrayList<>();
        producto3.add(3);
        producto3.add("Tablet");
        producto3.add(299.99);


        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }

    @GetMapping("/productos/{idProducto}")
    public String buscar(@PathVariable int idProducto) {
        for (ArrayList<Object> producto : productos) {
            if (producto.get(0).equals(idProducto)) {
                return "Producto encontrado: ID: " + producto.get(0) + ", Nombre: " + producto.get(1) + ", Precio: " + producto.get(2);
            }
        }
        return "Error 404: Producto no encontrado";
    }

}
