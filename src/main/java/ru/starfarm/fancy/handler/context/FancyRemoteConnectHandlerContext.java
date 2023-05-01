package ru.starfarm.fancy.handler.context;

import lombok.Data;
import ru.starfarm.fancy.remote.FancyRemote;

@Data
public class FancyRemoteConnectHandlerContext extends FancyRemoteHandlerContext {

    private final FancyRemote remote;

}
