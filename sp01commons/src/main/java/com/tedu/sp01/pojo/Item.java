package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by Administrator on 2019/7/30.
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Integer id;
    private String name;
    private Integer number;
}
