package com.ConditionalStatement;


public class IfElseStatement {
	public static class VotingEligibility{
		String name="Siya";
		int age=17;
		
		public void checkeligiblity() {
		if(age>=18) {
			
			System.out.println("Siya is Eligible, Thus can Vote");
		}
		else {
			System.out.println("Siya is not Eligible");
		}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VotingEligibility v1=new VotingEligibility();
		v1.checkeligiblity();
	}

}
