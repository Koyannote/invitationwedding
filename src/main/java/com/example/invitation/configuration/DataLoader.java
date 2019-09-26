package com.example.invitation.configuration;


import com.example.invitation.model.CategoryMade;
import com.example.invitation.model.Description;
import com.example.invitation.model.Invitation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DataLoader implements CommandLineRunner {



    private MongoTemplate mongoTemplate;


    public DataLoader(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override @Profile("dev")
    public void run(String... args) throws Exception {


        Invitation invitation =new Invitation("Lovey Dovey","39/First Floor/167 Street /Tamwe,Yangon", Arrays.asList("09264239635"),
                Arrays.asList("ReadyMade (350/1000 ks)","HandMade (350/1000 ks)"),
                Arrays.asList(new Description(CategoryMade.Readymade,Arrays.asList(350,1000)),new Description(CategoryMade.handmade,Arrays.asList(350,1000))),
                Arrays.asList("Ready/Handmade (100 cards) +50ks or 70ks","(200 cards) normal price"),42000);


        Invitation santhawthar =new Invitation("San Thaw Thar","19st (upper block),Yangon",Arrays.asList("095120488"),
                Arrays.asList("Readymade (500/600) to (4000) ks","Handmade (500/600) to (4000) ks"),
                Arrays.asList(new Description(CategoryMade.Readymade,Arrays.asList(500,600,1000)),new Description(CategoryMade.handmade,Arrays.asList(500,600,1000))),
                Arrays.asList(("Over 300 (discount)")),600000);

        Invitation loveforlove =new Invitation("Love for Love","No.137,31st (middle),Pabedan Tsp,Ygn",Arrays.asList("09798108014"),
                Arrays.asList("Readymade (350/1000) ks","Handmade (350/1000) ks"),
                Arrays.asList(new Description(CategoryMade.Readymade,Arrays.asList(350,1000)),new Description(CategoryMade.handmade,Arrays.asList(350,1000))),
                Arrays.asList("Large size (at least order 100","Normal size (at least order 200)"),35000);

    // this.mongoTemplate.insertAll(Arrays.asList(invitation,santhawthar,loveforlove));
    }
}
