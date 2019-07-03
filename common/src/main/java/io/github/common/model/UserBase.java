package io.github.common.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author Wilson
 * @date 2019/6/24
 **/
@Data
@Accessors(chain = true)
public class UserBase {
    private Integer id;
    private String name;
    private Integer age;
}
