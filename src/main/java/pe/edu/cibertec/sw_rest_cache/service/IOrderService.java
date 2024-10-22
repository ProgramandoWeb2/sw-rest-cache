package pe.edu.cibertec.sw_rest_cache.service;

import pe.edu.cibertec.sw_rest_cache.model.Order;

import java.util.List;

public interface IOrderService {

    List<Order> obtenerOrdenesXAnio(int anio);

    Order registrarOrden(Order order);

    Order actualizarOrden(Order order);

    void eliminarOrden(Integer id);

    void eliminarCache();
}
