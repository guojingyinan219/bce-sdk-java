/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.eip.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The request for binding eip.
 */
public class BindEipRequest extends AbstractBceRequest {
    /**
     * If the clientToken is not specified by the user, a random String generated by default algorithm will be used.
     * See more detail at
     * <a href = "https://bce.baidu.com/doc/EIP/API.html#.E9.80.9A.E7.94.A8.E8.AF.B4.E6.98.8E">
     *   BCE API doc</a>
     */
    @JsonIgnore
    private String clientToken;
    /**
     * eip address to be bound
     */
    @JsonIgnore
    private String eip;
    /**
     * type of instance to be bound
     */
    private String instanceType;
    /**
     * id of instance to be bound
     */
    private String instanceId;

    public String getClientToken() {
        return clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BindEipRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    public BindEipRequest withEip(String eip) {
        this.eip = eip;
        return this;
    }

    public BindEipRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public BindEipRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public BindEipRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
