/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constants;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author smarri
 */
public class Constants 
{
    // peg color options
    public static final ArrayList<Color> codeColors = new ArrayList<Color>(Arrays.asList(Color.PINK, Color.RED, 
                                        Color.ORANGE,  Color.YELLOW, Color.GREEN, Color.BLUE,
                                        Color.BLACK, Color.WHITE));
    
    // response color options
    public static final ArrayList<Color> responseColors = new ArrayList<Color>(Arrays.asList(Color.RED, Color.WHITE));
    
    public static final int MAX_ATTEMPTS = 10;
    
    public static final int MAX_PEGS = 4; 
    
    public static final int COLORS = 8;
            
}
