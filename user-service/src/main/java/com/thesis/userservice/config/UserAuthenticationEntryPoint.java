//package com.thesis.userservice.config;
//
//import com.thesis.userservice.DTO.ErrorDto;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class UserAuthenticationEntryPoint implements AuthenticationEntryPoint {
//  private static final ObjectMapper objectMapper = new ObjectMapper();
//
//
//  @Override
//  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
//     response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//     response.setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
//     objectMapper.writeValue(response.getOutputStream(), new ErrorDto("Unauthorized path"));
//  }
//}
