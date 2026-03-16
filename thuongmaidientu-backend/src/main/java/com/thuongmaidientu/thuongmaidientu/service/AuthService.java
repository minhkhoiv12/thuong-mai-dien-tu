package com.thuongmaidientu.thuongmaidientu.service;

import com.thuongmaidientu.thuongmaidientu.payload.AuthenticationResult;
import com.thuongmaidientu.thuongmaidientu.security.request.LoginRequest;
import com.thuongmaidientu.thuongmaidientu.security.request.SignupRequest;
import com.thuongmaidientu.thuongmaidientu.security.response.MessageResponse;
import com.thuongmaidientu.thuongmaidientu.security.response.UserInfoResponse;
import org.springframework.http.ResponseCookie;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;

public interface AuthService {

    AuthenticationResult login(LoginRequest loginRequest);

    ResponseEntity<MessageResponse> register(SignupRequest signUpRequest);

    UserInfoResponse getCurrentUserDetails(Authentication authentication);

    ResponseCookie logoutUser();


}
