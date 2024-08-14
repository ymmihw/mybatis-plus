package com.ymmihw.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@TableName("client")
@Getter
@Setter
public class Client {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime creationDate;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime lastModifiedDate;

    @TableLogic
    private Integer deleted;

    @Override
    public String toString() {
        return id + ":" + lastName + "," + firstName;
    }
}