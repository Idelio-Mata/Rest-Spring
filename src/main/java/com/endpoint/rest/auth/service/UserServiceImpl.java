package com.endpoint.rest.auth.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserServiceImpl {
    UserDetails findByUsername(String username) throws UsernameNotFoundException;
}
