package br.pic.token;

import java.security.SecureRandom;
import java.util.UUID;


public class TokenGenerator {
		
	protected static SecureRandom random = new SecureRandom();

	UUID uuid = UUID.randomUUID();     
	
    public static void main(String[] args) throws Exception {
    	new TokenGenerator();
    }
    	
    public TokenGenerator() throws Exception {
    		
    	System.out.println(uuid.toString().substring(0, 6).toUpperCase());

    }
        
        
        
}



