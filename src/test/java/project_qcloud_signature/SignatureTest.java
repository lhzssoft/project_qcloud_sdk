package project_qcloud_signature;


import org.junit.Assert;
import org.junit.Test;

import com.qcloud.tls.Signature.CheckTLSSignatureResult;
import com.qcloud.tls.Signature.GenTLSSignatureResult;

public class SignatureTest 
{

	@Test
	public void test()   throws Exception
	{
		
//		-----BEGIN EC PARAMETERS-----
//		BgUrgQQACg==
//		-----END EC PARAMETERS-----
//		-----BEGIN EC PRIVATE KEY-----
//		MHQCAQEEIGh0ZGZpftUUfgCyhlrBfgcASMla9RoRRk6GY8jLV2W2oAcGBSuBBAAK
//		oUQDQgAEucWJGkV8W4dsF+d5lKYsXRuK5Qrbzlm/CZY5b47RlUUedLVl8Cf/gZSQ
//		mDqg5H95t4hC5ACIkQ10QTmwMltuMg==
//		-----END EC PRIVATE KEY-----
		
		
        String sdkAppid ="1400000267";
        String identifier ="xiaojun";
        String privatekey ="-----BEGIN EC PARAMETERS-----\n"
        		.concat("BgUrgQQACg==\n")
        		.concat("-----END EC PARAMETERS-----\n")
        		.concat("-----BEGIN EC PRIVATE KEY-----\n")
        		.concat("MHQCAQEEIGh0ZGZpftUUfgCyhlrBfgcASMla9RoRRk6GY8jLV2W2oAcGBSuBBAAK\n")
        		.concat("oUQDQgAEucWJGkV8W4dsF+d5lKYsXRuK5Qrbzlm/CZY5b47RlUUedLVl8Cf/gZSQ\n")
        		.concat("mDqg5H95t4hC5ACIkQ10QTmwMltuMg==\n")
        		.concat("-----END EC PRIVATE KEY-----\n")
        ;
        
        
        
        privatekey = "-----BEGIN PRIVATE KEY-----\n"
        		 +	"MIGEAgEAMBAGByqGSM49AgEGBSuBBAAKBG0wawIBAQQgiBPYMVTjspLfqoq46oZd\n" 
        		 +	"j9A0C8p7aK3Fi6/4zLugCkehRANCAATU49QhsAEVfIVJUmB6SpUC6BPaku1g/dzn\n" 
        		 +	"0Nl7iIY7W7g2FoANWnoF51eEUb6lcZ3gzfgg8VFGTpJriwHQWf5T\n" 
        		 +	"-----END PRIVATE KEY-----"
		;
        
        System.out.println( privatekey);
		
        GenTLSSignatureResult result =  com.qcloud.tls.Signature.genTLSSignatureEx( Long.valueOf( sdkAppid), identifier, privatekey);
		
		System.out.println( String.format( "%d\r\n%s", result.expireTime,  result.urlSig)) ;
		
		
		
		String publickey = "-----BEGIN PUBLIC KEY-----\n"
						+	"MFYwEAYHKoZIzj0CAQYFK4EEAAoDQgAE1OPUIbABFXyFSVJgekqVAugT2pLtYP3c\n"
						+	"59DZe4iGO1u4NhaADVp6BedXhFG+pXGd4M34IPFRRk6Sa4sB0Fn+Uw==\n"
						+	"-----END PUBLIC KEY-----"
		;		
		
		
		CheckTLSSignatureResult check = com.qcloud.tls.Signature.checkTLSSignatureEx( 
				 							result.urlSig, Long.valueOf( sdkAppid),  identifier, publickey)
		;
		
		Assert.assertTrue( check.verifyResult);
	}

}
