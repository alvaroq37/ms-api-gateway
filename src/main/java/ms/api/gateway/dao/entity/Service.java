package ms.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_service")
public class Service {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
}
