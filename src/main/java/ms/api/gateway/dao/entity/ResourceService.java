package ms.api.gateway.dao.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "t_resource_service")
public class ResourceService {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
}
