package com.example.madlibs;

public class Games {
    public static String poem(String name){
        return("\nMy student " + name + " standing proud, is a fine example for the crowd.");
    }

    public static String fortuneTeller(String name)
    {
        String [] fortune = {"Skills comes from diligence.","Pleasures awaits you by the sea.","Beauty surrounds you because you create it.","The star of riches is shinning on you.","You are one smart cookie!"};
        int number = (int) (Math.random() * fortune.length);
        return("\nHere is your fortune " + name + ":\n" + fortune[number]);
    }

    public static String madLibs(String [] inputs){
        return("\nSleep-" + inputs[0] + " is a/an " + inputs[1] + " phenomenon that a \nsurprising number of " + inputs[2] + " experience. Usually, sleepwalkers climb\nout of their " + inputs[3] + " and begin to " + inputs[4] + " with their\n" + inputs[5] + " tightly shut. Sometimes they " + inputs[6] + "\noutdoors wearing only their " + inputs[7] + " pajamas." + " And it's not\nuncommon for " + inputs[8] + "-walkers to raid the " + inputs[9] + " and eat lots\nof " + inputs[10] + ". What's truly amazing is that they don't remember a/an\n" + inputs[11] + " thing the following " + inputs[12] + ". They\'ll open the fridge\nand say, \"" + inputs[13] + "! Where did all the " + inputs[14] + " go?\" They may\nnever know!");
    }
}
