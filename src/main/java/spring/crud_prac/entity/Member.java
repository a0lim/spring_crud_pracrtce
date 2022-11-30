package spring.crud_prac.entity;

import com.sun.istack.internal.NotNull;
import com.sun.javafx.beans.IDProperty;

public class Member {

    private Long id;
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



//@Entity
//
//public class Member {
//    @ID
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
//    @Column(name = "id", unique = True)
//    private Long Id;
//
//    @NotNull
//    @Column(name = "member_name")
//    private String member_name;
//}
