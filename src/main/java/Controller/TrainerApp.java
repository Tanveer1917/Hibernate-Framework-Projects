package Controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import Dao.TrainerDao;
import Model.Batch;
import Model.Trainer;
import Model.TrainerAddress;

public class TrainerApp {

	public static void main(String[] args)
	{
		TrainerDao service=new TrainerDao();
		//creating instance fro scanner
		
	    Scanner sc=new Scanner(System.in);
//	    System.out.println("Enter the trainer Name");
//	    String tname=sc.next();
//	    //creating instance of TrainerAddress
//	    
//	    TrainerAddress addressObj=new TrainerAddress();
//	    //setting all values with Trainer Address properties
//	    addressObj.setCityName("Pune");
//	    addressObj.setPincode(12345566L);
//	    System.out.println("Enter the Skill Set");
//	    String skills=sc.next();
//	    
//	    System.out.println("Enter the mail id");
//	    String mailId=sc.next();
//	    
//	    System.out.println("Enter the phone number");
//	    long ph=sc.nextLong();
//	    
//	    //Creating multiple instances of Batch class
//	    Batch batch=new Batch();
//	    System.out.println("Enter the bath name for Object1");
//	    String batchName=sc.next();
//	    
//	    System.out.println("Enter the batch technology");
//	    String tech=sc.next();
//	    
//	    batch.setBatchName(batchName);
//	    batch.setBatchStartDate(LocalDate.now());
//	    batch.setBatchEndDate(LocalDate.parse("2025-08-12"));
//	    batch.setTechnology(tech);
//	    
//	    Batch batch2=new Batch();
//	    batch.setBatchName("CSJ34");
//	    batch.setBatchStartDate(LocalDate.now());
//	    batch.setBatchEndDate(LocalDate.parse("2024-07-06"));
//	    batch.setTechnology("react");
//	    
//	    Trainer t=new Trainer();
//	    t.setAddress(addressObj);
//	    t.setName(tname);
//        t.setMailId(mailId);
//        t.setPhone(ph);
//        t.setSkillSet(skills);
//        
//        List<Batch>list=t.getBatches();
//        list.add(batch);
//        list.add(batch2);
//        
//        t.setBatches(list);
//        Trainer tObj=service.addTrainer(t);
//        if(tObj!=null)
//        {
//        	System.out.println("data added succesfully");
//        }
//        else
//        {
//        	System.out.println("not able to add"); 
//        }
       // calling getByid() method of TrainerDao
        System.out.println("Enter to existing id to search");
        int tid=sc.nextInt();
        Trainer t1=service.getById(tid);
        
        if(t1!=null)
        {
        	System.out.println(t1);
          }
        else
        {
        	System.out.println("Trainer Id does not exist");
        }
        
        System.out.println("Enter the Trainer id to update");
        int updateTid=sc.nextInt();
        System.out.println("Enter the skill  to update");
        String skill=sc.next();
        System.out.println("Enter the new phone number to update");
        long ph1=sc.nextLong();
        service.updateTrainer(updateTid, skill, ph1);
        System.out.println("Enter the Trainer Id it to delete");
        int tId1=sc.nextInt();
        service.removeTrainer(tId1);
        
       
	}
}
