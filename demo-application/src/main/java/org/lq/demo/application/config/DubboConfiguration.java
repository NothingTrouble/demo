/*package org.lq.demo.application.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;

@Configuration
@Data
@Slf4j
public class DubboConfiguration {

	
    @Value("${dubbo.application.name:demo-producer}")
    private String applicationName;

    @Value("${dubbo.registr.protocol:dubbo}")
    private String protocol;

    @Value("${dubbo.registry.address:zookeeper//192.168.99.130:2181,192.168.99.131:2181,192.168.99.132:2181}")
    private String registryAddress;

    @Value("${dubbo.protocol.name:dubbo}")
    private String protocolName;

    @Value("${dubbo.protocol.port:2181}")
    private int protocolPort;

    @Value("${dubbo.provider.timeout:5000}")
    private int timeout;

    @Value("${dubbo.provider.retries:3}")
    private int retries;

    @Value("${dubbo.provider.delay:30000}")
    private int delay;
    
    @Value("${dubbo.annotation.package:org.lq.demo}")
    private static String basePackage;
    
  
    *//**
     * 注入dubbo上下文
     * 
     * @return
     *//*
    @Bean
    public ApplicationConfig applicationConfig() {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(this.applicationName);
        log.info("****applicationName:{}",applicationName);
        return applicationConfig;
    }

    *//**
     * 注入dubbo注册中心配置,基于zookeeper
     * 
     * @return
     *//*
    @Bean
    public RegistryConfig registryConfig() {
        // 连接注册中心配置
        RegistryConfig registry = new RegistryConfig();
        registry.setProtocol(protocol);
        registry.setAddress(registryAddress);
        return registry;
    }

    *//**
     * 默认基于dubbo协议提供服务
     * 
     * @return
     *//*
    @Bean
    public ProtocolConfig protocolConfig() {
        // 服务提供者协议配置
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName(protocolName);
        protocolConfig.setPort(protocolPort);
        protocolConfig.setThreads(200);
        return protocolConfig;
    }

    *//**
     * dubbo服务提供
     * 
     * @param applicationConfig
     * @param registryConfig
     * @param protocolConfig
     * @return
     *//*
    @Bean(name="provider")
    public ProviderConfig providerConfig(ApplicationConfig applicationConfig, RegistryConfig registryConfig, ProtocolConfig protocolConfig) {
        ProviderConfig providerConfig = new ProviderConfig();
        providerConfig.setTimeout(timeout);
        providerConfig.setRetries(retries);
        providerConfig.setDelay(delay);
        providerConfig.setApplication(applicationConfig);
        providerConfig.setRegistry(registryConfig);
        providerConfig.setProtocol(protocolConfig);
        return providerConfig;
    }
    
    
    *//**
     * 设置dubbo扫描包
     * @param packageName
     * @return
     *//*
    @Bean
    public static AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage("org.lq.demo");
        log.info("****dubboScanPackage:{}",basePackage);
        return annotationBean;
    }

    
    
    
}*/