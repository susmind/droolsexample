package com.drools.example;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.drools.example.StlRules;


public class SltRulesEngine {
	
	public static void executeJobRules(StlRules sltRule)
	{
		try {
			// load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-stl-rules");
        	kSession.insert(sltRule);
            kSession.fireAllRules();
            kSession.dispose();
		}
		catch (Throwable t) {
            t.printStackTrace();
        }
		
	}

}
