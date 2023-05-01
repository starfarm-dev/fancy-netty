package ru.starfarm.fancy.packet;

import ru.starfarm.fancy.buffer.FancyBuffer;

public abstract class EmptyPacket extends FancyPacket {

    @Override
    public void write(FancyBuffer buffer) {

    }

    @Override
    public void read(FancyBuffer buffer) {

    }

}
