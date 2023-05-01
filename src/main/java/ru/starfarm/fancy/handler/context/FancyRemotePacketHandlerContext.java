package ru.starfarm.fancy.handler.context;

import lombok.Data;
import ru.starfarm.fancy.packet.FancyPacket;
import ru.starfarm.fancy.packet.callback.Callback;
import ru.starfarm.fancy.remote.FancyRemote;

@Data
public class FancyRemotePacketHandlerContext extends FancyRemoteHandlerContext {

    private final FancyRemote remote;
    private final Callback<?> callback;
    private final FancyPacket packet;

}
