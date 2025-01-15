package filter;

import jakarta.servlet.*;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RealFilter extends GenericFilter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Cookie cookie = new Cookie("RealFilter", "Works");
        cookie.setPath(((HttpServletRequest)servletRequest).getContextPath());
        cookie.setMaxAge(60);

        ((HttpServletResponse)servletResponse).addCookie(cookie);

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
