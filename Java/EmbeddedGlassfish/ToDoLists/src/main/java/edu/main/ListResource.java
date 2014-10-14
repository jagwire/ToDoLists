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
@Path("list")
public class ListResource {
    
    @GET
    public Response index() {
        return Response.ok("ALL LISTS!").build();
    }
}
