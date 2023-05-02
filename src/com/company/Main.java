package com.company;

public class Main {
    public static void main(String[] args) {

       SolarSystem factorX = new SolarSystem();
        factorX.sun="1";
        factorX.moon="4";
        factorX.planet="2";
        factorX.star="10000";

        // Add features to our sun
        FeatureSun xFact = new FeatureSun();
        xFact.color="green";
        xFact.radius="100000000km";
        xFact.heat="395739593kj";

        // Add feature to our star
        FeatureStars facX = new FeatureStars();
        facX.color="green";
        facX.radius="948654jg";
        facX.size="777";

    }
}