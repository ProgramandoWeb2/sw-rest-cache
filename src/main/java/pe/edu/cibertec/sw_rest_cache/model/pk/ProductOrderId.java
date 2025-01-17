package pe.edu.cibertec.sw_rest_cache.model.pk;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@Embeddable
public class ProductOrderId implements Serializable {
    private Integer orderid;
    private Integer productid;
}
