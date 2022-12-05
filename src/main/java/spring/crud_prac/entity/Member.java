package spring.crud_prac.entity;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@DynamicInsert
@DynamicUpdate
public class Member {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에서 자동으로 생성함
    @Column(name = "id", unique = true)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    public void setName(String name){
        this.name = name;
    }

}
