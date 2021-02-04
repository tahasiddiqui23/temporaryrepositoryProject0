//Class
public class Plane {
    
    //Private Attributes
    private double maxAltitude;
    private String model;
    private boolean landingGear;
    private double currentAltitudeInFeet;
    
    //Contructor
    public Plane(double initMaxAltitude, double initCurrentAltitude, String initModel, boolean initLandingGear){
        
        maxAltitude=initMaxAltitude;
        model=initModel;
        landingGear=initLandingGear;
        currentAltitudeInFeet=initCurrentAltitude;
       
    }
   
    //Functions/Methods
    void enableLandingGear() {
        
        if (currentAltitudeInFeet<1000){
            
            landingGear=true;
        
        }
        return;
        
    }
    
    void disableLandingGear(){
        
        if (currentAltitudeInFeet>=1000){
            
            landingGear=false;
                  
        }
        
        return;
        
    }
    
    double getMaxAltitude(){
        
        return maxAltitude;
    }
    
    boolean getLandingGear(){
        
        return landingGear;
    }
    
    double getCurrentAltitudeInFeet(){
        
        return currentAltitudeInFeet;
    }
    
    String getModel(){
        
        return model;
    }
    
    void changeAltitude(double altitude){
        
        if (altitude<maxAltitude && altitude>=1000){
            
            currentAltitudeInFeet=altitude;
            return;
            
        }
            if (altitude<1000 && landingGear==true){
                
                currentAltitudeInFeet=altitude;
                return;
                
            }
            return;
            
    }
    
    
    
    
    
    
}
