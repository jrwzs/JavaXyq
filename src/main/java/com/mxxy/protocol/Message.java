package com.mxxy.protocol;

import com.mxxy.net.Server;

import java.nio.channels.SocketChannel;

abstract public class Message {

    public abstract byte[] toBytes();

    public abstract void parse(byte[] bytes);// 解析bytes

    public abstract void handle(); // 客户端处理消息

    public abstract void serverHandle(Server server, SocketChannel sc); // 服务器响应客户端
}
