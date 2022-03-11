package com.game.client;

import com.game.NPC;

public class NPCClient {

    public static void main(String[] args) {
        // create com.game.NPC object and set its properties
        NPC npcAvatar = new NPC();
        npcAvatar.setName("Zulu");
        System.out.println(npcAvatar.toString());
        npcAvatar.speak("There is no spoon");
    }
}
