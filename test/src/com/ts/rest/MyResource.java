
package com.ts.rest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import com.ts.DAO.LoginDAO;
import com.ts.DAO.ProductDAO;
import com.ts.DAO.RegisterDAO;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
	@Context
	UriInfo uriInfo;
	@Context
	Request request;
	
	@GET 
    @Path("/hi")
    @Produces("text/plain")
    public String getIt() {
        return "Hi there! Angular REST SERVICES";
    }
    @GET 
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Hello there! WECCOME TO BVRIT";
    }
    @GET 
    @Path("/getData")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getDat() {
       List<Student> list = new ArrayList<Student>();
    	Student student1=new Student(100,"PASHA");
    	list.add(student1);
    	Student student2=new Student(101,"INDIRA");
    	list.add(student2);
     	return list;
    }
    
    @POST
	@Path("/register1")
	@Consumes(MediaType.APPLICATION_JSON)
	public void addStudent(Student student) throws IOException {
		System.out.println("Hi! save called..."+student.getId()+" "+student.getName());
	}
    
    @POST
   	@Path("/registrationform")
    @Produces(MediaType.APPLICATION_JSON)
       public String addUser(User user) throws IOException {
    	System.out.println("In dao-------");
       			RegisterDAO u = new RegisterDAO();
       		if (u.addUser(user)){
       			System.out.println("Successfully Inserted\n");
       			System.out.println(user.getPassword());
       			return "Successfully Inserted";
       		} else {
       			System.out.println("Not Inserted\n");
       			return "Not Inserted";
       		}
       }
    @POST
   	@Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
       public String validate(User user) {
    	return RegisterDAO.validate(user);
    }
	@GET
	@Path("/sunglassdetails")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> getData2() throws ClassNotFoundException, SQLException {
		System.out.println("hi in dao");
		ProductDAO products_dao = new ProductDAO();
		List<Product> list2 = new ArrayList<Product>();
		list2 = products_dao.getAllProducts();
		System.out.println(list2);
		return list2;
		
	}


}
