package com.game;
/*
* Business class to model the workings of a com.game.NPC
 */

import com.game.Race;
import com.game.Sex;

public class NPC {
    // fields
    public static final String poem = "I met a traveller from an antique land,\n" + //public String riddles
            "Who said—“Two vast and trunkless legs of stone\n" +
            "Stand in the desert. . . . Near them, on the sand,\n" +
            "Half sunk a shattered visage lies, whose frown,\n" +
            "And wrinkled lip, and sneer of cold command,\n" +
            "Tell that its sculptor well those passions read\n" +
            "Which yet survive, stamped on these lifeless things,\n" +
            "The hand that mocked them, and the heart that fed;\n" +
            "And on the pedestal, these words appear:\n" +
            "My name is Ozymandias, King of Kings;\n" +
            "Look on my Works, ye Mighty, and despair!\n" +
            "Nothing beside remains. Round the decay\n" +
            "Of that colossal Wreck, boundless and bare\n" +
            "The lone and level sands stretch far away.”\n";

    private Sex sex = Sex.MALE;
    private Race race = Race.HUMAN;
    private String name = "Avatar";
    private String riddle = "What part of a vegetable can you not eat?"; //Default riddle
    private String answer = "The wheelcahir"; //Answer to Riddle
    private String saying= "Is there a spoon?"; //Default com.game.NPC saying

    private String speed = "Walk"; //Default com.game.NPC walking pace
    private int age;
    private int strength;

    // constructors
    public NPC() {
        name = "No Name";
    }
    public NPC(String name) {
        setName(name);
    }
    public NPC(String name, int age) {
        this();
        setAge(age);
    }

    // business methods
    public String poem() { // Responds with a poem
        return poem;
    }

    public String speak() { // Responds with saying
        return saying;
    }

    public String speak(String sentence) {
        System.out.println(sentence);
        return sentence;
    }

    // accessors

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 1000) {
            this.age = age;
        }
        else {
            System.out.println(age + " is an invalid input for age. Please input a valid age");
        }
    }

    public String getSaying() {
        return saying;
    }

    public void setSaying(String saying) {
        this.saying = saying;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getSpeed(){
        return speed;
    }

    public void setSpeed(String speed) {
        if (speed.toLowerCase().equals("walk") || speed.toLowerCase().equals("run") ) {
            this.speed = speed;
        }
        else {
            System.out.println(speed + " is not a correct input, please choose either 'walk' or 'run'");
        }
    }

    // toString

    public String toString() {
        return "\nName- " + name + "\ncom.game.Race: " + race + "\ncom.game.Sex: " +sex + "\nRiddle: " + riddle +
                "\nAnswer: " + answer + "\nSaying: " + saying;
    }
}
