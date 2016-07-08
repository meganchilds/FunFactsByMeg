package com.meganlianne.funfacts;


import java.util.Random;

public class FactBook {
    // Fields (Member Variables) - Properties about the object
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Banging your head against a wall burns 150 calories an hour.",
            "When hippos are upset, their sweat turns red.",
            "If you lift a kangaroo’s tail off the ground it can’t hop.",
            "Billy goats urinate on their own heads to smell more attractive to females.",
            "Heart attacks are more likely to happen on a Monday.",
            "You cannot snore and dream at the same time.",
            "Hitler’s mother considered abortion but the doctor persuaded her to keep the baby.",
            "A sheep, a duck and a rooster were the first passengers in a hot air balloon.",
            "Catfish are the only animals that naturally have an odd number of whiskers.",
            "About 8,000 Americans are injured by musical instruments each year.",
            "Nearly three percent of the ice in Antarctic glaciers is penguin urine.",
            "A small child could swim through the veins of a blue whale.",
            "Pirates wore earrings because they believed it improved their eyesight",
            "The testicles on an octopus are located in its head.",
            "The toothpaste ‘Colgate’ in Spanish translates to ‘go hang yourself.",
            "It snowed in the Sahara desert for 30 minutes on the 18th February 1979.",
            "The first alarm clock could only ring at 4am.",
            "Birds don’t urinate.",
            "Slugs have 4 noses.",
            "George Washington grew marijuana in his garden.",
            "A company in Taiwan makes dinnerware out of wheat, so you can eat your plate",
            "The average person walks the equivalent of twice around the world in a lifetime.",
            "The Bible is the most shoplifted book in the world.",
            "California has issued 6 drivers licenses to people named Jesus Christ.",
            "Marco Hort has the world record for fitting 264 straws in his mouth at once.",
            "In the Caribbean there are oysters that can climb trees.",
            "Squirrels forget where they hide about half of their nuts.",
            "Over 1000 birds a year die from smashing into windows.",
            "The inventor of the Waffle Iron did not like waffles.",
            "In 1895 Hampshire police handed out the first ever speeding ticket, fining a man for doing 6mph.",
            "Each year, there are more than 40,000 toilet related injuries in the United States.",
            "Every year more than 2500 left-handed people are killed from using right-handed products.",
            "Kleenex tissues were originally used as filters in gas masks.",
            "Upon losing battles, apes will tend to masturbate.",
            "You burn more calories sleeping than you do watching television.",
            "A single cloud can weight more than 1 million pounds.",
            "The world’s oldest piece of chewing gum is over 9,000 years old.",
            "A sneeze travels about 100 miles per hour.",
            "It would take a sloth one month to travel one mile.",
            "10% of the World’s population is left handed.",
            "A mole can dig a tunnel that is 300 feet long in only one night.",
            "A hippo’s wide open mouth is big enough to fit a 4 foot tall child in.",
            "About 150 people per year are killed by coconuts.",
            "Chewing gum burns about 11 calories per hour.",
            "Gorillas burp when they are happy.",
            "It is considered good luck in Japan when a sumo wrestler makes your baby cry.",
            "Human thigh bones are stronger than concrete.",
            "More than 60,000 people are flying over the United States in an airplane right now.",
            "Hamsters run up to 8 miles at night on a wheel.",
            "A waterfall in Hawaii goes up sometimes instead of down.",
            "Earth is the only planet that is not named after a god.",
            "Just like fingerprints, everyone has different tongue prints.",
            "The male ostrich can roar just like a lion.",
            "Mountain lions can whistle.",
            "Cows kill more people than sharks do.",
            "Cats have 32 muscles in each of their ears.",
            "Butterflies taste their food with their feet.",
            "The tongue of a blue whale weighs more than most elephants.",
            "A flea can jump up to 200 times its own height. That is the equivalent of a human jumping the Empire State Building." };


    // Methods - Actions the object can take
    public String getFact() {
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
