/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.main;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Ryan
 */
@ApplicationPath("api/v1")
public class Application  extends ResourceConfig {
    public Application() {
        System.out.println("XXX APPLICATION CREATED!");
        
        packages("edu.main");
    }
}
