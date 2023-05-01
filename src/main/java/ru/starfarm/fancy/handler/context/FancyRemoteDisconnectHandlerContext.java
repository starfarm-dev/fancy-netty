package ru.starfarm.fancy.handler.context;

import lombok.Data;
import ru.starfarm.fancy.remote.FancyRemote;

@Data
public class FancyRemoteDisconnectHandlerContext extends FancyRemoteHandlerContext {

    private final FancyRemote remote;

    @Override
    public void setCancelled(boolean cancelled) {
        throw new UnsupportedOperationException("Not supported on disconnect handler context");
    }

}
