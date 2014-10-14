/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.main;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author Ryan
 */
@Path("lists")
public class ListResource {
    
    public ListResource() {
        System.out.println("LIST RESOURCE CREATED!");
    }
    
    @GET
    public Response index() {
        return Response.ok("Howdy!").build();
    }
}
