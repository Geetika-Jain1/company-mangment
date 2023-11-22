package org.example.employees;

import org.example.Website;

public class CloudDeveloper extends Developer {

    public CloudDeveloper(String name, String programmingLanguage){
        super(name, programmingLanguage);
    }

    public void fixWebsite(Website website){
        website.fix();
    }
}
