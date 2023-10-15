package ms.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_resource_micro_service")
public class ResourceMicroService {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
}
