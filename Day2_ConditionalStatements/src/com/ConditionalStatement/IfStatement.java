package com.ConditionalStatement;

public class IfStatement {
	public static class VotingEligibility{
		String name="Siya";
		int age=19;
		
		public void checkeligiblity() {
		if(age>=18) {
			
			System.out.println("Siya can Vote");
		}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingEligibility v1=new VotingEligibility();
		v1.checkeligiblity();
	}

}
