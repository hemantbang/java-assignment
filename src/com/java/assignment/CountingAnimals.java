package com.java.assignment;

import com.java.assignment.Animal;
import com.java.assignment.Bird;
import com.java.assignment.Cat;
import com.java.assignment.Chicken;
import com.java.assignment.Dog;
import com.java.assignment.Duck;
import com.java.assignment.Frog;
import com.java.assignment.Parrot;
import com.java.assignment.Rooster;
import com.java.assignment.Clownfish;
import com.java.assignment.Dolphin;
import com.java.assignment.Fish;
import com.java.assignment.Shark;
import com.java.assignment.Butterfly;

public class CountingAnimals {
	
	public static void main(String[] args) {
		
		System.out.println("Starting counting animals....");
		
		int countOfAnimalCanFly = 0;
		int countOfAnimalCanWalk = 0;
		int countOfAnimalCanSing = 0;
		int countOfAnimalCanSwim = 0;
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
				};
	
		for(Animal animal: animals){
			if(animal.canFly){
				countOfAnimalCanFly++;
			}
			if(animal.canWalk){
				countOfAnimalCanWalk++;
			}
			if(animal.canSing){
				countOfAnimalCanSing++;
			}
			if(animal.canSwim){
				countOfAnimalCanSwim++;
			}
		}
		
		System.out.println("Count of Animals can fly  = "+countOfAnimalCanFly);
		System.out.println("Count of Animals can walk = "+countOfAnimalCanWalk);
		System.out.println("Count of Animals can sing = "+countOfAnimalCanSing);
		System.out.println("Count of Animals can swim = "+countOfAnimalCanSwim);
	}
}
