package ru.starfarm.fancy;

import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import ru.starfarm.fancy.handler.FancyRemoteHandler;
import ru.starfarm.fancy.metrics.FancyMetrics;
import ru.starfarm.fancy.packet.callback.FancyCallbackProvider;
import ru.starfarm.fancy.packet.registry.FancyPacketRegistry;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;

public interface FancyBase {

    Logger getLogger();

    FancyMetrics getMetrics();

    FancyPacketRegistry getPacketRegistry();

    FancyCallbackProvider getCallbackProvider();

    FancyRemoteHandler getRemoteHandler();

    EventLoopGroup getEventLoop();

    Channel getChannel();

    InetSocketAddress getSocketAddress();

    default InetAddress getAddress() {
        return getSocketAddress().getAddress();
    }

    boolean isActive();

    void close();

}
