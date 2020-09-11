package site.javaee.annotation.entity;

import lombok.Data;

import java.util.Date;

/**
 * created by CaiBaoHong at 2018/4/17 14:55<br>
 */
@Data
public class Role {

    private Long rid;       // 角色id
    private String rname;   // 角色名，用于显示
    private String rdesc;   // 角色描述
    private String rval;    // 角色值，用于权限判断
    private Date created;   // 创建时间
    private Date updated;   // 修改时间



}
