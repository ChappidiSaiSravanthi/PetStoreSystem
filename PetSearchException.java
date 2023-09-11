package com.amdocs.petsearch.exception;

public class PetSearchException extends Exception {
    private static final long serialVersionUID = 1L;
	public PetSearchException(String message) {
//        super(message);
        System.out.println("INVALID PET DETAILS");
    }
}

