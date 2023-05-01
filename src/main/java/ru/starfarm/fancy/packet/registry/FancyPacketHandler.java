package ru.starfarm.fancy.packet.registry;

import ru.starfarm.fancy.packet.FancyPacket;
import ru.starfarm.fancy.remote.FancyRemote;

@FunctionalInterface
public interface FancyPacketHandler<P extends FancyPacket> {

    void handle(FancyRemote remote, P packet);

}
