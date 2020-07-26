
package rastreador;

import com.teamdev.jxmaps.swing.MapView;
import javax.swing.JFrame;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;

public class Mapa extends MapView 
{
    private Map map;
    public Mapa(String nName)
    {
    JFrame frame = new JFrame (nName);
     setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus status) {
             if(status == MapStatus.MAP_STATUS_OK)
             {
              map=getMap();
              
              MapOptions mapOptions = new MapOptions();
              MapTypeControlOptions controlOptions = new MapTypeControlOptions();
             mapOptions.setMapTypeControlOptions(controlOptions);
             
             map.setOptions(mapOptions);
             map.setCenter(new LatLng( 18.628227, -99.166870));
             map.setZoom(18.0);
             
             Marker mark = new Marker(map);
             mark.setPosition(map.getCenter());
             }
                
                
                
            }
        });
     
      frame.add(this,BorderLayout.CENTER);
      frame.setSize(700,500);
      frame.setVisible(true);
     
    }
public static void main(String args[]) {
        Mapa ob = new Mapa("Localizacion del animal");
    }
   
}
