package com.tts;

import com.tts.animal.Cat;
import com.tts.animal.Pet;

public class Main {

    public static void main(String[] args) {

        Pet myPet = new Pet();
        Pet petTwo = new Pet(3, "window", "cat");
        System.out.println(myPet);
        System.out.println(petTwo);

        Cat myCat = new Cat();
        Cat catTwo = new Cat(7.3, true);
        Cat catThree = new Cat(6, "porch", "tabby", "Tutu", 4.8, false);
        System.out.println(myCat);
        System.out.println(catTwo);
        System.out.println(catThree);

        catThree.setAge(9);
        System.out.println(catThree);

        myCat.askOwner();
        System.out.println(myCat);

    }//end main()
}//end Main
