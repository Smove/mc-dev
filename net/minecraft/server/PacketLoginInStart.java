package net.minecraft.server;

import net.minecraft.util.com.mojang.authlib.GameProfile;

public class PacketLoginInStart extends Packet {

    private GameProfile a;

    public PacketLoginInStart() {}

    public PacketLoginInStart(GameProfile gameprofile) {
        this.a = gameprofile;
    }

    public void a(PacketDataSerializer packetdataserializer) {
        this.a = new GameProfile((String) null, packetdataserializer.c(16));
    }

    public void b(PacketDataSerializer packetdataserializer) {
        packetdataserializer.a(this.a.getName());
    }

    public void a(PacketLoginInListener packetlogininlistener) {
        packetlogininlistener.a(this);
    }

    public GameProfile c() {
        return this.a;
    }
}
