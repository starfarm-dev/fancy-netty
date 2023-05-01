package ru.starfarm.fancy.server;

import io.netty.channel.ChannelFuture;
import ru.starfarm.fancy.packet.FancyPacket;
import ru.starfarm.fancy.packet.callback.Callback;
import ru.starfarm.fancy.remote.FancyRemote;
import ru.starfarm.fancy.FancyBase;

import java.util.List;
import java.util.Set;

public interface FancyServer extends FancyBase {

    Set<FancyRemote> getRemotes();

    ChannelFuture bind(int port);

    void broadcast(FancyPacket packet);

    <P extends FancyPacket> List<Callback<P>> broadcastCallback(FancyPacket packet);

}
