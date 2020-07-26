
package rastreador;

import com.teamdev.jxmaps.swing.MapView;
import javax.swing.JFrame;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;

public class Historial extends MapView 
{
    private Map map2;
    private Map map;
    public Historial(String nName)
    {
    JFrame frame = new JFrame (nName);
   
     setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus status) {
             if(status == MapStatus.MAP_STATUS_OK)
             {
              map2=getMap();
              map=getMap();
              
              MapOptions mapOptions = new MapOptions();
              MapTypeControlOptions controlOptions = new MapTypeControlOptions();
             mapOptions.setMapTypeControlOptions(controlOptions);
             
             map.setOptions(mapOptions);
             map.setCenter(new LatLng( 18.628227, -99.166870));
             map.setZoom(18.0);
             
             map2.setOptions(mapOptions);
             map2.setCenter(new LatLng( 18.628286, -99.166809));
             map2.setZoom(18.0);
            
             
             Marker mark = new Marker(map);
             mark.setPosition(map.getCenter());
             Marker mark1 = new Marker(map2);
            mark1.setPosition(map2.getCenter());
            
             }
                
                
                
            }
        });
     
      frame.add(this,BorderLayout.CENTER);
      frame.setSize(700,500);
      frame.setVisible(true);
     
    }
    
    
    
    
    
    
    
public static void main(String args[]) {
        Historial ob = new Historial("Localizacion del animal");
    }
   
}
