package com.game.test;

import com.game.NPC;

class NPCValidationTest {


    public static void main(String[] args) {
        NPC avatar = new NPC();

        avatar.setAge(50); //Lower Bound 0, Upper 1000
        avatar.setSpeed("Run"); //Run or Walk
    }
}

