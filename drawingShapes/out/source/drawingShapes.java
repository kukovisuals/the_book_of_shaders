/* autogenerated by Processing revision 1293 on 2024-02-27 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import com.thomasdiewald.pixelflow.java.DwPixelFlow;
import com.thomasdiewald.pixelflow.java.imageprocessing.DwShadertoy;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class drawingShapes extends PApplet {




DwPixelFlow context;
DwShadertoy toy;

public void settings() {
    size(1280, 720, P2D);
    smooth(0);
}

public void setup() {
    surface.setResizable(true);
    context = new DwPixelFlow(this);
    context.print();
    context.printGL();
    toy = new DwShadertoy(context, "data/main.frag");
    frameRate(60);
}

public void draw() {
    
    toy.apply(this.g);
    
    String txt_fps = String.format(getClass().getSimpleName() + "   [size %d/%d]   [frame %d]   [fps %6.2f]", width, height, frameCount, frameRate);
    surface.setTitle(txt_fps);
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "drawingShapes" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
