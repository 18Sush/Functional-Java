package com.casestudy;

class Candidate {
    public boolean checkAge(int age) {
        if (age > 18) {
            System.out.println(age+" is valid age");
        } else {
            System.out.println(age+" is invalid age");
        }
		return false;
    }
}
