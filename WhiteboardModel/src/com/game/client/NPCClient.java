package com.game.client;

import com.game.NPC;

public class NPCClient {

    public static void main(String[] args) {
        // create com.game.NPC object and set its properties
        NPC npcAvatar = new NPC();
        System.out.println(npcAvatar);
        NPC npcAvatar2 = new NPC("Zulu");
        System.out.println(npcAvatar2);
        NPC npcAvatar3 = new NPC("Zulu", 23);
        System.out.println(npcAvatar3);

        /*
        npcAvatar.setName("Zulu");
        System.out.println(npcAvatar.toString());
        npcAvatar.speak("There is no spoon");

        NPC npcAvatar = new NPC();
        System.out.println(npcAvatar);

         */

    }
}
