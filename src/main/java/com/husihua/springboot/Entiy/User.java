package com.husihua.springboot.Entiy;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String userName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("sexHuSiHua")
    private String sex;

    @JsonIgnore
    private String pwd;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date date;

}
