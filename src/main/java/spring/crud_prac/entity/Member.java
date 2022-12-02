package spring.crud_prac.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

@Entity
public class Member {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB에서 자동으로 생성함
    @Column(name = "id", unique = true)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

}
