package edu.main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.glassfish.embeddable.Deployer;
import org.glassfish.embeddable.GlassFish;
import org.glassfish.embeddable.GlassFishException;
import org.glassfish.embeddable.GlassFishProperties;
import org.glassfish.embeddable.GlassFishRuntime;
import org.glassfish.embeddable.archive.ScatteredArchive;

public class Start {
    /**
     * @param args the command line arguments
     */
    
    public static final String HTTP = "http-listener";
    public static final String HTTPS = "https-listener";
    
    public static void main(String[] args) {
        
        GlassFishProperties properties = new GlassFishProperties();
        properties.setPort(HTTP, 8080);
        properties.setPort(HTTPS, 8181);
        
        try {
            GlassFish glassfish = GlassFishRuntime.bootstrap().newGlassFish(properties);
            glassfish.start();
            
            System.out.println("SERVER STARTED SUCCESSFULLY!");
            System.out.println("CREATING SCATTERED ARCHIVE!");
            Deployer deployer = glassfish.getDeployer();
            
            ScatteredArchive archive = new ScatteredArchive("testapp", ScatteredArchive.Type.WAR);
            archive.addClassPath(new File("build/classes/main/edu/main"));
            deployer.deploy(archive.toURI(), "--name", "testapp");
            
            
            
            
            
        } catch (GlassFishException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
