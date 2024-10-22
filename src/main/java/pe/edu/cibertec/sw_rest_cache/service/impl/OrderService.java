package pe.edu.cibertec.sw_rest_cache.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.sw_rest_cache.model.Order;
import pe.edu.cibertec.sw_rest_cache.repository.OrderRepository;
import pe.edu.cibertec.sw_rest_cache.service.IOrderService;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;

    @Cacheable(value = "ordenesAnio", key="anio")
    @Override
    public List<Order> obtenerOrdenesXAnio(int anio) {
        return orderRepository.obtenerOrdenesPorAnio(anio);
    }

    @CacheEvict(value = "ordenesAnio", allEntries = true)
    @Override
    public Order registrarOrden(Order order) {
        return orderRepository.save(order);
    }

    @CachePut(value = "ordenesAnio", key = "#order.orderid")
    @Override
    public Order actualizarOrden(Order order) {
        return null;
    }

    @CacheEvict(value = "ordenesAnio", allEntries = true)
    @Override
    public void eliminarOrden(Integer id) {

    }

    @CacheEvict(value = {"ordenesAnio"}, allEntries = true)
    @Override
    public void eliminarCache() {

    }


}
