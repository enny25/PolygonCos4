/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Diana
 */
public class MyServletTest {
    
    public MyServletTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dataSource.DBFacade.test=true;
    }
    
    @After
    public void tearDown() {
        dataSource.DBFacade.test=false;
    }

   @Test
    public void testNewBuilding() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
     
     when(request.getParameter("action")).thenReturn("addBuilding");    
     when(request.getParameter("name")).thenReturn("me");
     when(request.getParameter("address")).thenReturn("SpoonerStreet 123");
     when(request.getParameter("customerID")).thenReturn("1");
     when(request.getParameter("size")).thenReturn("2.0");
     
     new MyServlet().doPost(request,response);
     
        
    }
    @Test
    public void testNewCustomer() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
    HttpServletResponse response = mock(HttpServletResponse.class);
     
     when(request.getParameter("action")).thenReturn("createCustomer");    
     when(request.getParameter("name")).thenReturn("me");
     when(request.getParameter("pwd")).thenReturn("123");
     when(request.getParameter("address")).thenReturn("SpoonerStreet 123");
     when(request.getParameter("sign-upDate")).thenReturn("2011-01-31");
     
     new MyServlet().doPost(request,response);
     
        
    }

    
    
}
