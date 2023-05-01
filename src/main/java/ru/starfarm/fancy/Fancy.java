package ru.starfarm.fancy;

import lombok.experimental.UtilityClass;
import ru.starfarm.fancy.client.FancyClient;
import ru.starfarm.fancy.client.FancyNettyClient;
import ru.starfarm.fancy.handler.FancyRemoteHandler;
import ru.starfarm.fancy.packet.registry.FancyPacketRegistry;
import ru.starfarm.fancy.server.FancyNettyServer;
import ru.starfarm.fancy.server.FancyServer;
import ru.starfarm.fancy.util.NettyUtil;

import java.util.logging.Logger;

@UtilityClass
public class Fancy {

    public FancyClient createClient(FancyPacketRegistry packetRegistry) {
        return createClient(packetRegistry, new FancyRemoteHandler());
    }

    public FancyClient createClient(FancyPacketRegistry packetRegistry, FancyRemoteHandler handlers) {
        return createClient(packetRegistry, handlers, NettyUtil.LOGGER);
    }

    public FancyClient createClient(FancyPacketRegistry packetRegistry, FancyRemoteHandler handlers, Logger logger) {
        return new FancyNettyClient(logger, packetRegistry, handlers);
    }

    //Server

    public FancyServer createServer(FancyPacketRegistry packetRegistry) {
        return createServer(packetRegistry, new FancyRemoteHandler());
    }

    public FancyServer createServer(FancyPacketRegistry packetRegistry, FancyRemoteHandler handlers) {
        return createServer(packetRegistry, handlers, NettyUtil.LOGGER);
    }

    public FancyServer createServer(FancyPacketRegistry packetRegistry, FancyRemoteHandler handlers, Logger logger) {
        return new FancyNettyServer(logger, packetRegistry, handlers);
    }

}
