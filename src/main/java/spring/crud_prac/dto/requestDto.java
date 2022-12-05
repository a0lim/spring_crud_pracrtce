package spring.crud_prac.dto;

//import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class requestDto {
    private String name;

    public requestDto(String name){
        this.name = name;
    }


}


