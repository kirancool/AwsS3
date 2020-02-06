package com.awss3;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.HttpMethod;
import com.amazonaws.SdkClientException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@SpringBootTest
class AwsS3ExampleApplicationTests {
	public static void main(String args[])
	{
		String file_path="/home/kiru/bank.csv";
		String bucket_name="kiru";
		String key_name ="data";
		BasicAWSCredentials awscred=new BasicAWSCredentials("AKIATMKHB4FTJPMMR6WD","QRl6OVjzjJSliS2FcZ+wr9Wgp3TiWvkMfa5Mb68u");
		AmazonS3 as=AmazonS3ClientBuilder.standard().withRegion(Regions.AP_SOUTH_1)
				.withCredentials(new AWSStaticCredentialsProvider(awscred))
				.withForceGlobalBucketAccessEnabled(true)
				.build();
	
		try {
			as.putObject(bucket_name,key_name,new File(file_path));
		}catch(AmazonServiceException e) {
		    System.err.println(e.getErrorMessage());
			
		}

}
}