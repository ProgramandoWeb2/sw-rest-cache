package pe.edu.cibertec.sw_rest_cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.sw_rest_cache.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository <Order, Integer>
{

    @Query(value = "SELECT * FROM Orders WHERE YEAR(OrderDate) = :anio",
    nativeQuery = true)
    List<Order> obtenerOrdenesPorAnio(@Param("anio") int anio);


}
