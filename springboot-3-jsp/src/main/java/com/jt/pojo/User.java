package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName(value = "user") // 对象与表对应 如果表名和对象名称一致可以省略不写
public class User {
	@TableId(type = IdType.AUTO)
	private Integer id;
	// @TableField(value = "name") // 手动配置属性与字段的对应关系
	private String name;
	private Integer age;
	private String sex;
}
