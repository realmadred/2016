//package com.memcached.config;
//
//import jdk.nashorn.internal.ir.annotations.Reference;
//import net.rubyeye.xmemcached.MemcachedClient;
//import net.rubyeye.xmemcached.XMemcachedClientBuilder;
//import net.rubyeye.xmemcached.command.TextCommandFactory;
//import net.rubyeye.xmemcached.impl.KetamaMemcachedSessionLocator;
//import net.rubyeye.xmemcached.transcoders.SerializingTranscoder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//import java.util.ArrayList;
//import java.util.List;
///**
// * Created by lf on 2016/11/15.
// */
//@Configuration
////@PropertySource(value = "classpath:application.yml")
//@ConfigurationProperties(prefix = "memcached")
//public class MemcachedConfig {
//
//    private String host;
//    private Integer port;
//    private Integer connectionPoolSize;
//    private boolean failureMode;
//    private Integer weight;
//
//    @Bean
//    public XMemcachedClientBuilder getXMemcachedClientBuilder(){
//        List<InetSocketAddress> list = new ArrayList<>();
//        int[] weights = new int[]{weight};
//        InetSocketAddress socketAddress = new InetSocketAddress(host,port);
//        list.add(socketAddress);
//        TextCommandFactory factory = new TextCommandFactory();
//        KetamaMemcachedSessionLocator sessionLocator = new KetamaMemcachedSessionLocator();
//        SerializingTranscoder serializingTranscoder = new SerializingTranscoder();
//        XMemcachedClientBuilder builder = new XMemcachedClientBuilder(list,weights);
//        builder.setConnectionPoolSize(connectionPoolSize);
//        builder.setFailureMode(failureMode);
//        builder.setSessionLocator(sessionLocator);
//        builder.setCommandFactory(factory);
//        builder.setTranscoder(serializingTranscoder);
//        return builder;
//    }
//
////    @Bean
////    public XMemcachedClientBuilder getXMemcachedClientBuilder(@Value("${host}") String host
////            ,@Value("${port}") Integer post
////            ,@Value("${connectionPoolSize}") Integer connectionPoolSize
////            ,@Value("${failureMode}") boolean failureMode
////            ,@Value("${weight}") Integer weight){
////        List<InetSocketAddress> list = new ArrayList<>();
////        int[] weights = new int[]{weight};
////        InetSocketAddress socketAddress = new InetSocketAddress(host,post);
////        list.add(socketAddress);
////        TextCommandFactory factory = new TextCommandFactory();
////        KetamaMemcachedSessionLocator sessionLocator = new KetamaMemcachedSessionLocator();
////        SerializingTranscoder serializingTranscoder = new SerializingTranscoder();
////        XMemcachedClientBuilder builder = new XMemcachedClientBuilder(list,weights);
////        builder.setConnectionPoolSize(connectionPoolSize);
////        builder.setFailureMode(failureMode);
////        builder.setSessionLocator(sessionLocator);
////        builder.setCommandFactory(factory);
////        builder.setTranscoder(serializingTranscoder);
////        return builder;
////    }
//
//    @Bean
//    public MemcachedClient getMemcachedClient(@Autowired XMemcachedClientBuilder builder) throws IOException {
//        MemcachedClient client = builder.build();
//        return client;
//    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public void setHost(String host) {
//        this.host = host;
//    }
//
//    public Integer getPort() {
//        return port;
//    }
//
//    public void setPort(Integer port) {
//        this.port = port;
//    }
//
//    public Integer getConnectionPoolSize() {
//        return connectionPoolSize;
//    }
//
//    public void setConnectionPoolSize(Integer connectionPoolSize) {
//        this.connectionPoolSize = connectionPoolSize;
//    }
//
//    public boolean isFailureMode() {
//        return failureMode;
//    }
//
//    public void setFailureMode(boolean failureMode) {
//        this.failureMode = failureMode;
//    }
//
//    public Integer getWeight() {
//        return weight;
//    }
//
//    public void setWeight(Integer weight) {
//        this.weight = weight;
//    }
//}
