package jwt;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.primeframework.jwt.Signer;
import org.primeframework.jwt.Verifier;
import org.primeframework.jwt.domain.JWT;
import org.primeframework.jwt.hmac.HMACSigner;
import org.primeframework.jwt.hmac.HMACVerifier;

public class Test
{
    public static void main(String[] args)
    {
    	Signer signer=HMACSigner.newSHA512Signer("too many secretss");
    	JWT jwt=new JWT();
    	jwt.setIssuer("www.acme.com");
    	jwt.setIssuedAt(ZonedDateTime.now(ZoneOffset.UTC));
    	jwt.setSubject("hello");
    	jwt.setExpiration(ZonedDateTime.now(ZoneOffset.UTC).plusMinutes(60));
    	String encodedJWT = JWT.getEncoder().encode(jwt, signer);
    	System.out.println(encodedJWT);
    	
    	Verifier verifier = HMACVerifier.newVerifier("too many secrets");
    	JWT jwt_d = JWT.getDecoder().decode(encodedJWT, verifier);
    	
    	System.out.println(jwt_d.subject);
    }
}