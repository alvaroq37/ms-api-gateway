package ms.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_microservice")
public class MicroService {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
}
