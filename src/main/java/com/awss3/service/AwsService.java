package com.awss3.service;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class AwsService {

	//private AmazonS3 amazonS3;
	
	
	@Value("${aws.access.key.id}")
	private String awskeyId;
	
	@Value("${aws.access.key.secret}")
	private String awsScreetKey;
	
	@Value("${aws.region}")
	private String awsRegion;
	
	@Value("${aws.s3.bucket}")
	private String awsBucket;	
		
		BasicAWSCredentials awsCreds = new BasicAWSCredentials(this.awskeyId,this.awsScreetKey);
		AmazonS3 s3 = AmazonS3Client.builder()
			    .withRegion("ap-south-1")
			    .withCredentials(new AWSStaticCredentialsProvider(awsCreds)).build();	

		

	public String uploadfile(MultipartFile file) throws IOException {
		String url="";
		File file1=convertMultiPartToFile(file);
		String filename=file.getOriginalFilename();
	 url=awsBucket+"/"+file;
	 uploadFiletobucket(filename,file);
				return null;
	}



	private void uploadFiletobucket(String filename, MultipartFile file) {
		s3.putObject(new PutObjectRequest(awsBucket, filename,(File) file));
		
	}



	private File convertMultiPartToFile(MultipartFile file) throws IOException {
		File f=new File(file.getOriginalFilename());
		FileOutputStream fs=new FileOutputStream(f);
		fs.write(file.getBytes());
		fs.close();
		return f;
	}

}
