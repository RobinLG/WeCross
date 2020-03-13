package com.webank.wecross.config;

import com.webank.wecross.p2p.netty.NettyBootstrap;
import com.webank.wecross.p2p.netty.message.MessageCallBack;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NettyBootstrapConfig {
    @Resource WeCrossConfig p2pConfig;

    @Resource MessageCallBack messageCallBack;

    @Bean
    public NettyBootstrap newNettyBootstrap() {
        NettyBootstrap bootstrap = new NettyBootstrap();
        bootstrap.setConfig(p2pConfig);
        bootstrap.setMessageCallBack(messageCallBack);

        return bootstrap;
    }
}