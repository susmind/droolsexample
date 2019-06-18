package com.drools.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drools.example.Job;

public class RulesEngine {
	
	public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-job-rules");

            // go !
        	Job job = new Job();
        	job.setJobName("Sample Water Pipeline Job");
        	job.setJobType("Water Pipeline Job");
        	job.setJobStatus("New");
        	
            kSession.insert(job);
            kSession.fireAllRules();
            System.out.println("Job Owner : " + job.getJobOwner());
            
            kSession.dispose();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
	
	public static void executeJobRules(Job inputJob)
	{
		try {
            // load up the knowledge base
			System.out.println("Started...");
			inputJob.setJobOwner("Inside the Rules Engine");
	        KieServices ks = KieServices.Factory.get(); // coming as null
	       	      
	        System.out.println("KieServices Object... " + ks);
    	    KieContainer kContainer = ks.getKieClasspathContainer();
    	    System.out.println("KieContainer Object..." + kContainer);
        	KieSession kSession = kContainer.newKieSession("ksession-job-rules");
        	System.out.println("Method Called...");

            kSession.insert(inputJob);
            kSession.fireAllRules();
            System.out.println("Job Owner : " + inputJob.getJobOwner());
            
            kSession.dispose();
            
        } catch (Throwable t) {
            t.printStackTrace();
        }
		
	}
	

}

