package edu.ppu.runners;

import java.util.ArrayList;

import edu.ppu.domain.Person;

public class TestPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Person p=new Person(122,"Ahmad");
		
		ArrayList<Person> pl= new ArrayList<Person>();
		
		pl.add(new Person(13,"nnor"));
		
		pl.add(new Person(164,"sami"));
		
		
		System.out.println(p.toString());
		
		calAvg(pl)	;	
	}
	
	
static void	calAvg(ArrayList<Person> t)

{
	for (Person g: t) System.out.println(g); 

}





}
