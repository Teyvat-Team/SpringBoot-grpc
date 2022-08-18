package com.wr.localclient.model.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Attr {
    private String[] dimension;
    private String[] matrix;
}
