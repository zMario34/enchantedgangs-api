package tech.zmario.enchantedgangs.api.objects;

import lombok.Data;

import java.util.UUID;

@Data
public class GamePlayer {

    private final UUID player;
    private String gangName;
    private boolean gangChatEnabled = false;

}
