package com.tyoturvallisuus;
import java.util.ArrayList;
import java.util.EnumMap;

import Util.ObservationCategoryReader;

public class ObservationCategory {
	
    private enum Observation
    {
        OBSERVATION_CATEGORY0,
        OBSERVATION_CATEGORY1,
        OBSERVATION_CATEGORY2,
        OBSERVATION_CATEGORY3,
        OBSERVATION_CATEGORY4,
        OBSERVATION_CATEGORY5,
        OBSERVATION_CATEGORY6
    }
    
    private static EnumMap<Observation, String> map = new EnumMap<>(Observation.class);

    ObservationCategory(){
    	ObservationCategory.map = populateObservationTypes();
    }

    private EnumMap<Observation, String> populateObservationTypes() {
    	ObservationCategoryReader observationCodesReader = new ObservationCategoryReader();
    	ArrayList<String> observationCodes = observationCodesReader.getObservationCodes();
    	
    	for(int i = 0; i < observationCodes.size(); i++) {
            map.put(Observation.values()[i], observationCodes.get(i));
    	}
        return map;
    }
    
    public static String getObservationType(int obsCode){
        return map.get(Observation.values()[obsCode]);
    }
    
    public static int getObservationCount() {
    	return ObservationCategory.Observation.values().length;
    }
}
