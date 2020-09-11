package site.javaee.annotation.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * created by CaiBaoHong at 2018/4/17 14:55<br>
 */
@Data
public class RolePerm implements Serializable {

    private Long roleId;
    private Long permId;


}
