package com.fm.common.util.security.entity;

import lombok.Data;

/**
 * @Description: SecurityReq
 *
 */
@Data
public class SecurityReq {
    private String data;
    private String pubKey;
    private String signData;
    private String aesKey;
}
