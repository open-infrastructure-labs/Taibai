package com.fitmgr.common.security.util;

import com.fitmgr.common.security.service.FitmgrUser;
import lombok.Data;

import java.io.Serializable;

@Data
public class FitmgrUserByToken implements Serializable {
    private static final long serialVersionUID = -3100954690395063850L;

    private int code;

    private String msg;

    private FitmgrUser data;
}
