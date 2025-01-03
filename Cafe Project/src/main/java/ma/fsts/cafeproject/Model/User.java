package ma.fsts.cafeproject.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;


@NamedQuery(name="User.findByEmailId", query="select u from User u where u.email=:email")
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Table(name="user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id ;

    @Column(name="name")
    private String name;


    @Column(name="contactNumber")
    private String contactNumber;

    @Column(name="email")
    private String email;


    @Column(name="password")
    private String password;

    @Column(name="role")
    private String role;

    @Column(name="status")
    private String status;


}
