/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filter;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Main
 */
public class AuthenticationFilter implements Filter
{

    @Override
    public void init(FilterConfig fc) throws ServletException {;}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
    {
        HttpSession session = ((HttpServletRequest)request).getSession();
        
        if(session.getAttribute("userID") == null)
        {
            ((HttpServletResponse)response).sendRedirect("login");
            return;
        }
        
        chain.doFilter(request, response);
    }
 
    @Override
    public void destroy() {;}
    
}