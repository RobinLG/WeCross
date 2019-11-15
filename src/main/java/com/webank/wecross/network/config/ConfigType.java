package com.webank.wecross.network.config;

public class ConfigType {

    // stub type
    public static final String STUB_TYPE_BCOS = "BCOS";
    public static final String STUB_TYPE_JDCHAIN = "JDCHAIN";
    public static final String STUB_TYPE_REMOTE = "REMOTE";

    // resource type
    public static final String RESOURCE_TYPE_BCOS_CONTRACT = "BCOS_CONTRACT";
    public static final String RESOURCE_TYPE_JDCHAIN_CONTRACT = "JDCHAIN_CONTRACT";
    public static final String RESOURCE_TYPE_TEST = "TEST_RESOURCE";

    // transaction response message type
    public static final String TRANSACTION_RSP_TYPE_NORMAL = "NORMAL";
    public static final String TRANSACTION_RSP_TYPE_BCOS = TRANSACTION_RSP_TYPE_NORMAL;
    public static final String TRANSACTION_RSP_TYPE_JDCHAIN = "JDCHAIN";
    public static final String TRANSACTION_RSP_TYPE_FABRIC = "FABRIC";
}