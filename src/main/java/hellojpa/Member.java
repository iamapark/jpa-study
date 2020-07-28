package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jinyoung.park
 * @date 2020/07/26
 */
@Entity
public class Member {
    @Id
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
