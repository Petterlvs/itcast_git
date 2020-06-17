package domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 阿伦
 * @date 2020/6/17 10:54
 */
@Data
public class User implements Serializable {
    private String username;
    private String email;
}
