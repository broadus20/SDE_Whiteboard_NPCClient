package com.game.client;

import com.game.NPC;
import com.game.Race;
import com.game.Sex;

class npcClientArgs {
    public static void main(String[] args) {

        if (args.length < 4) {
            String usage = "Usage: java com.game.client.npcClientArgs <name> <age> <sex> <race>";
            String example = "Example: java npcClientArgs Zulu 25 MALE HUMAN ";
            String note = "Note: Supported sexes are: (MALE/FEMALE) \n " +
                    "supported races include (HUMAN/ELF/DWARF/HOBBIT)";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        System.out.println("You provided " + args.length + " arguments");

        NPC npc1 = new NPC();
        npc1.setName(args[0]);
        npc1.setAge(Integer.parseInt(args[1]));
        npc1.setSex(Sex.valueOf(args[2]));
        npc1.setRace(Race.valueOf(args[3]));
        System.out.println(npc1);
    }
}
