import java.util.Scanner;
import java.util.*;
import java.util.Random;

public class ControlFlowProject {

    public static void main( String[] args) {
         Scanner userInput = new Scanner(System.in);
         ArrayList<String> LotteryNumbs = new ArrayList<String>();
         ArrayList<Integer> LottoNumbs = new ArrayList<Integer>();


         /////Random Number Generator////////////-----PRINT NOT NEEDED
         Random rand = new Random();
         int n = rand.nextInt(50);
             n += 1;
        // System.out.println(n);

        System.out.println("What is your name?");
         String userName = userInput.nextLine();

        System.out.printf("Hello %s\n", userName);

        System.out.println("Do you want to play a game...(Y/N)..?");

        String userAgree = userInput.nextLine();
    switch (userAgree) {
        case "Yes":
        case "yes":
        case "Y":
        case "y":

                System.out.print("Excellent......hehehee.....let us begin...\n");
                ////////////////FIRST NUMBER///////////
                System.out.println("First off.....pick a number between 1 and 50:");
                String randUserNumb = userInput.nextLine();
                int randNumb = Integer.parseInt(randUserNumb);
                do {
                    System.out.print("Follow directions, i said pick a number between 1 and 50:\n");
                    randUserNumb = userInput.nextLine();
                    randNumb = Integer.parseInt(randUserNumb);
                } while (randNumb <= 1 || randNumb >= 50);
                 String usersRandomChoice = Integer.toString(randNumb);
                System.out.print("Good choice....one moment\n");
                // Adds Random Number Choice to array
                LotteryNumbs.add(usersRandomChoice);
                int randomLottoNumber = randNumb - n;
                if(randomLottoNumber <= 0)
                    {int overLordRandomNumber = (randomLottoNumber * -1);
                    LottoNumbs.add(overLordRandomNumber);}
                    else{LottoNumbs.add(randomLottoNumber);}
                //System.out.println(LottoNumbs);

                ////////////PET/PERSON'S AGE////////////////
                System.out.print("Do you have a pet(s)?\n");
                 String msg = " ";
                 String perChoice = userInput.nextLine();
                switch (perChoice) {
                    case "Yes":
                    case "yes":
                    case "Y":
                    case "y":

                        System.out.print("Cool, how old is your oldest pet?\n");
                        String pAgeString = userInput.nextLine();
                        LotteryNumbs.add(pAgeString);
                        int petsAge = Integer.parseInt(pAgeString);
                        int ageAddition = petsAge + randNumb;
                        LottoNumbs.add(ageAddition);


                        System.out.println("What is your pet's name?(lower case only)\n");
                        String petName = userInput.nextLine();
                        //split up the input name into a string array           
                        String petLetters[] = petName.split("");
                        //Prints out the third letter of the pet's-----PRINT IS NOT NEEDED
                       //System.out.println(petLetters[2]); 

                        String petThirdLetter = petLetters[2];
                        char tLetter[]=petThirdLetter.toCharArray();
                        char third = tLetter[0];
                        int asciiPetLetter = (int) third;
                        //System.out.println(asciiPetLetter);
                        LottoNumbs.add(asciiPetLetter);

                        break;

                    case "No":
                    case "no":
                    case "N":
                    case "n":
////////Get converted to int and add to LottoNumbs
                        System.out.println("ummm.....well..then...how old are you?\n");
                        pAgeString = userInput.nextLine();
                        LotteryNumbs.add(pAgeString);
                        int personAge = Integer.parseInt(pAgeString);
                        int peronsAgeAddition = personAge + randNumb;
                        LottoNumbs.add(peronsAgeAddition);
                        //LottoNumbs.add(pAgeString);

                        System.out.println("What is your favorite car brand?\n");
                        String carBrand = userInput.nextLine();
                        //split up the input name into a string array           
                        String carBrandLetters[] = carBrand.split("");
                        //Prints out the third letter of the pet's-----PRINT IS NOT NEEDED
                       //System.out.println(petLetters[2]); 

                        String carThirdLetter = carBrandLetters[2];
                        char cLetter[]=carThirdLetter.toCharArray();
                        char carsLetterValue = cLetter[0];
                        int asciiCarLetter = (int) carsLetterValue;
                        //System.out.println(asciiPetLetter);
                        LottoNumbs.add(asciiCarLetter);

                        break;

                }
                ///////////LUCKY NUMBER/////////////
                //Asks, prints user's lucky number----PRINT IS NOT NEEDED
                System.out.println("what is your lucky number? (between 1 and 999)\n");
                String luckyNumber = userInput.nextLine();
                LotteryNumbs.add(luckyNumber);
                //System.out.println(LotteryNumbs);

                System.out.println(msg);
                // Adds pet's/person's age to array
                ////////ACTOR/ACTRESS' NAME FOR FIRST AND LAST NAME/////////////
                System.out.println("What is the first name of the their favorite actor or actress? (all lower case please)\n");
                String actingName = userInput.nextLine();
                //split up the input name into a string array           
                String letters[] = actingName.split("");
                //Prints out the first letter of the actor/actress-----PRINT IS NOT NEEDED
                //System.out.println(letters[0]); 

                String firstLetter = letters[0];
                char fLetter[]=firstLetter.toCharArray();
                char first = fLetter[0];
                int asciiFirstLetter = (int) first;
                //System.out.println(asciiFirstLetter);
                LottoNumbs.add(asciiFirstLetter);


               //Finds and Prints the last letter of the actor/actress array------PRINT IS NOT NEEDED
               String lastLetter = letters[letters.length-1];
               //System.out.println(lastLetter);
                //Converts the string array of last letter into a character array
               char lLetter[]=lastLetter.toCharArray();
               //Finds the first element of the lLetter array
               char last = lLetter[0];
               
               //Converts the character of last into an integer and prints the ascii value;  
               int asciiLastLetter = (int) last;
              // System.out.println(asciiLastLetter);
                    //System.out.print(ascii);
                //LotteryNumbs.add();
               // System.out.print(LotteryNumbs);
                LottoNumbs.add(asciiLastLetter);

                System.out.println("what is your 2 digit birth year?\n");
                String magicString = userInput.nextLine();
                int magicInt = Integer.parseInt(magicString);
                int magicNumber = randNumb + magicInt;
               // LottoNumbs.add(magicNumber);
                System.out.println(LottoNumbs + " Magic Number: " + magicNumber);
                break;

                
                ////////RANDOM NUMBER SELECTION/////
                
               
                       
                        
        case "No":
        case "no":
        case "N":
        case "n":
            System.out.print("You're no fun :(");
                break;
            }

        

        
    }
}