package org.main.RMI;


import org.main.Entidades.*;

import java.rmi.Remote;
import java.util.List;

public interface RemoteInterface extends Remote {
	public void leerArreglo(int[] arreglo) throws Exception;
	void mostrarArreglo(int[] arreglo) throws Exception;

	<Cliente> void leerClientes(List<Cliente> clientes) throws Exception;

	<DetalleVenta> void leerDetalleVentas(List<DetalleVenta> detalleVentas) throws Exception;

	<Producto>void leerProductos(List<Producto> productos);

	<Proveedor>void leerProveedores(List<Proveedor> proveedores);

	<TipoProducto>void leerTiposProducto(List<TipoProducto> tiposProducto);

	<Venta>void leerVentas(List<Venta> ventas);

	public org.main.Entidades.Cliente buscarCliente(int identificacion, List<org.main.Entidades.Cliente> clientes) throws Exception;

	org.main.Entidades.DetalleVenta buscarDetalleVenta(int identificacion, List<org.main.Entidades.DetalleVenta> detallesVenta) throws Exception;

	org.main.Entidades.Producto buscarProducto(int identificacion, List<org.main.Entidades.Producto> productos) throws Exception;

	org.main.Entidades.Proveedor buscarProveedor(int identificacion, List<org.main.Entidades.Proveedor> proveedores) throws Exception;

	org.main.Entidades.TipoProducto buscarTipoProducto(int identificacion, List<org.main.Entidades.TipoProducto> tiposProducto) throws Exception;

	org.main.Entidades.Venta buscarVenta(int identificacion, List<org.main.Entidades.Venta> ventas) throws Exception;


	void leerProducto(Producto producto);
	void leerCliente(Cliente cliente);
}
