package com.mycompany.myapp.security;

/**
 * Constants for Spring Security authorities.
 */
public final class AuthoritiesConstants {

    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";
    
    public static final String SYSADMIN = "ROLE_SYSADMIN";
    public static final String COACH = "ROLE_COACH";
    public static final String SUP = "ROLE_SUP";
    public static final String PROJECTREP = "ROLE_PROJECTREP";
    public static final String SPONSOR = "ROLE_SPONSOR";

    private AuthoritiesConstants() {
    }
}
