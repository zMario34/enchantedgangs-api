package me.zmario.enchantedgangs.api.objects;

import lombok.Data;

import java.util.UUID;

@Data
public class IGamePlayer {

    private final UUID player;
    private String gangName;
    private boolean gangChatEnabled = false;

}
