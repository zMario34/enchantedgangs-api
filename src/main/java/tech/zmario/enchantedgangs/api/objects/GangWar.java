package tech.zmario.enchantedgangs.api.objects;

import lombok.Data;

@Data
public class GangWar {

    private final String firstGang;
    private final String secondGang;

    private boolean started = false;

    private Arena arena;

}
