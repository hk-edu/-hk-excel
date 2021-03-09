package com.hk.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author pengzhengfa
 */
@Data
public class UserEntity implements Serializable {
    
    @Excel(name = "编号")
    private String id;
    
    @Excel(name = "姓名")
    private String name;
    
    @Excel(name = "生日", format = "yyyy年MM月dd日", width = 30.0)
    private Date bir;
    
    @Excel(name = "身份证号", width = 30.0)
    private String no;
    
    @Excel(name = "籍贯")
    private String address;
}
