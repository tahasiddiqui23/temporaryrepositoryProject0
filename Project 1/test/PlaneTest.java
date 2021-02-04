

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class PlaneTest {
    
    public PlaneTest() {
        
    }

    @Test
    public void testGetMaxAltitude() {
       
       
      double initMaxAltitude=1.0;
      
      Plane plane1= new Plane (201500.0,1000.0,"Boeing", false);
      
      assertEquals(plane1.getMaxAltitude(),1000.0,.0001);
      
       
    }
    
    @Test
    public void testGetModel(){
        
        String initModel="Boeing";
        
          Plane plane1= new Plane (201500.0,1000.0,"Boeing", false);
      
      assertEquals(plane1.getModel(),1000.0,.0001);
      
        
        
        
    }
    
    @Test
    public void testGetCurrentAltitude(){
        
        double initCurrentAltitude=1.0;
        
         Plane plane1= new Plane (201500.0,1000.0,"Boeing", false);
      
      assertEquals(plane1.getCurrentAltitudeInFeet(),1000.0,.0001);
    }
    
    @Test
    public void testGetLandingGear(){
            
         Plane plane2= new Plane (201500.0,1000.0,"Boeing", true);
         
         assertTrue(plane2.getLandingGear());
    }
    
    @Test 
    
    public void testEnableLandingGear(){
        
        Plane plane3= new Plane (201500.0,900.0,"Boeing", false);
        
        plane3.enableLandingGear();
        assertTrue(plane3.getLandingGear());
        
    }
    
    @Test 
     public void testDisableLandingGear(){
        
        Plane plane4= new Plane (201500.0,2000.0,"Boeing", true);
        
        plane4.disableLandingGear();
        assertTrue(plane4.getLandingGear());
        
       
    }
     
     @Test 
     
     public void testChangeInAltitude(){
         
         Plane plane5= new Plane(2000.0,1000.0,"Boeing", true);
                 
         plane5.changeAltitude(1500);
         
         assertEquals(plane5.getCurrentAltitudeInFeet(),1500,0.001);
     
         
                 
         Plane plane6= new Plane (2000.0,1000.0,"Boeing", true);
         
           plane6.changeAltitude(1500);
           
           assertEquals(plane6.getCurrentAltitudeInFeet(),1500,0.001);
         
                 
         
         
         Plane plane7= new Plane (2000.0,900.0,"Boeing", true);
         
         plane7.changeAltitude(900.0);
         assertEquals(plane7.getCurrentAltitudeInFeet(),900.0,0.001);
         
         
         Plane plane8= new Plane(2000.0,900.0,"Boeing", true);
         
         plane8.changeAltitude(900.0);
         
         assertEquals(plane8.getCurrentAltitudeInFeet(),900.0,.001);
        
        
     }
    
    
    
    
    
    
    
}
