package org.main.CLIENTE;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.main.Entidades.*;
import org.main.RMI.RemoteInterface;

public class MainCliente {
    public static void main(String[] args) {
        try {
            Registry registroCliente = LocateRegistry.getRegistry("192.168.20.29", 2024);
            System.out.println(registroCliente);
            RemoteInterface rmi = (RemoteInterface) registroCliente.lookup("Proveedores");

            List<Cliente> listCliente = new ArrayList<>();
            listCliente.add(new Cliente(1, "Juan Perez", "Calle 123", "123456789", "juan.perez@example.com"));
            listCliente.add(new Cliente(2, "Maria Lopez", "Avenida 456", "987654321", "maria.lopez@example.com"));
            listCliente.add(new Cliente(3, "Carlos Gomez", "Boulevard 789", "123123123", "carlos.gomez@example.com"));
            listCliente.add(new Cliente(4, "Ana Martinez", "Calle 101", "321321321", "ana.martinez@example.com"));
            listCliente.add(new Cliente(5, "Luis Rodriguez", "Avenida 202", "456456456", "luis.rodriguez@example.com"));

            List<DetalleVenta> listDetalleVenta = new ArrayList<>();
            listDetalleVenta.add(new DetalleVenta(1, 1, 1, 2, 139998));
            listDetalleVenta.add(new DetalleVenta(2, 1, 2, 1, 129999));
            listDetalleVenta.add(new DetalleVenta(3, 2, 3, 1, 89999));
            listDetalleVenta.add(new DetalleVenta(4, 2, 4, 2, 79998));
            listDetalleVenta.add(new DetalleVenta(5, 3, 5, 1, 49999));
            listDetalleVenta.add(new DetalleVenta(6, 3, 6, 3, 44997));
            listDetalleVenta.add(new DetalleVenta(7, 4, 7, 2, 15998));
            listDetalleVenta.add(new DetalleVenta(8, 4, 8, 1, 8999));
            listDetalleVenta.add(new DetalleVenta(9, 5, 9, 2, 59998));
            listDetalleVenta.add(new DetalleVenta(10, 5, 10, 1, 12999));

            List<Producto> listProducto = new ArrayList<>();
            listProducto.add(new Producto(1, "Smartphone", "Teléfono inteligente de última generación", 699.99, 1, 1, 50));
            listProducto.add(new Producto(2, "Laptop", "Computadora portátil con procesador de alta velocidad", 1299.99, 2, 1, 30));
            listProducto.add(new Producto(3, "Smart TV", "Televisor con pantalla LED de 55 pulgadas y funciones inteligentes", 899.99, 3, 2, 20));
            listProducto.add(new Producto(4, "Tablet", "Dispositivo móvil con pantalla táctil de 10 pulgadas", 399.99, 4, 1, 40));
            listProducto.add(new Producto(5, "Cámara digital", "Cámara compacta de alta resolución con zoom óptico", 499.99, 5, 3, 25));
            listProducto.add(new Producto(6, "Auriculares inalámbricos", "Auriculares Bluetooth con cancelación de ruido", 149.99, 6, 4, 60));
            listProducto.add(new Producto(7, "Altavoz Bluetooth", "Altavoz portátil con conexión inalámbrica y batería recargable", 79.99, 7, 5, 100));
            listProducto.add(new Producto(8, "Router WiFi", "Dispositivo para redes inalámbricas con tecnología de doble banda", 89.99, 8, 6, 40));
            listProducto.add(new Producto(9, "Impresora multifunción", "Impresora láser con escáner y copiadora integrados", 299.99, 9, 7, 15));
            listProducto.add(new Producto(10, "Reproductor de Blu-ray", "Reproductor de discos Blu-ray con capacidad de reproducción en 4K", 129.99, 10, 8, 25));

            List<Proveedor> listProveedor = new ArrayList<>();
            listProveedor.add(new Proveedor(1, "Proveedor A", "Direccion A", "111111111", "a@example.com", "Electrónica"));
            listProveedor.add(new Proveedor(2, "Proveedor B", "Direccion B", "222222222", "b@example.com", "Informática"));
            listProveedor.add(new Proveedor(3, "Proveedor C", "Direccion C", "333333333", "c@example.com", "Electrodomésticos"));
            listProveedor.add(new Proveedor(4, "Proveedor D", "Direccion D", "444444444", "d@example.com", "Electrónica"));
            listProveedor.add(new Proveedor(5, "Proveedor E", "Direccion E", "555555555", "e@example.com", "Fotografía"));
            listProveedor.add(new Proveedor(6, "Proveedor F", "Direccion F", "666666666", "f@example.com", "Audio"));
            listProveedor.add(new Proveedor(7, "Proveedor G", "Direccion G", "777777777", "g@example.com", "Redes"));
            listProveedor.add(new Proveedor(8, "Proveedor H", "Direccion H", "888888888", "h@example.com", "Electrónica"));
            listProveedor.add(new Proveedor(9, "Proveedor I", "Direccion I", "999999999", "i@example.com", "Oficina"));
            listProveedor.add(new Proveedor(10, "Proveedor J", "Direccion J", "101010101", "j@example.com", "Entretenimiento"));

            List<TipoProducto> listTipoProducto = new ArrayList<>();
            listTipoProducto.add(new TipoProducto(1, "Teléfonos"));
            listTipoProducto.add(new TipoProducto(2, "Televisores"));
            listTipoProducto.add(new TipoProducto(3, "Cámaras"));
            listTipoProducto.add(new TipoProducto(4, "Audio"));
            listTipoProducto.add(new TipoProducto(5, "Altavoces"));
            listTipoProducto.add(new TipoProducto(6, "Redes"));
            listTipoProducto.add(new TipoProducto(7, "Oficina"));
            listTipoProducto.add(new TipoProducto(8, "Reproductores"));

            List<Venta> listVenta = new ArrayList<>();
            listVenta.add(new Venta(1, 1399.98, 1, new Date(124, 5, 15)));
            listVenta.add(new Venta(2, 1299.99, 2, new Date(124, 5, 16)));
            listVenta.add(new Venta(3, 899.99, 3, new Date(124, 5, 17)));
            listVenta.add(new Venta(4, 799.98, 4, new Date(124, 5, 18)));
            listVenta.add(new Venta(5, 499.99, 5, new Date(124, 5, 19)));
            listVenta.add(new Venta(6, 449.97, 6, new Date(124, 5, 20)));
            listVenta.add(new Venta(7, 159.98, 7, new Date(124, 5, 21)));
            listVenta.add(new Venta(8, 89.99, 8, new Date(124, 5, 22)));
            listVenta.add(new Venta(9, 599.98, 9, new Date(124, 5, 23)));
            listVenta.add(new Venta(10, 129.99, 10, new Date(124, 5, 24)));


            rmi.leerClientes(listCliente);
            rmi.leerProductos(listProducto);
            rmi.leerVentas(listVenta);
            rmi.leerDetalleVentas(listDetalleVenta);
            rmi.leerProveedores(listProveedor);
            rmi.leerTiposProducto(listTipoProducto);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
