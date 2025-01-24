package com.login.login.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration

//con esta anotacion estamos indicando que configuraremos la seguridad de la aplicacion

@EnableWebSecurity
public class SecurityConfig {


    //First Configuration
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .authorizeHttpRequests()
//                    .requestMatchers("/api-jwt/index2").permitAll()
//                    .anyRequest().authenticated()
//                .and()
//                .formLogin().permitAll()
//                .and()
//                .build();
//
//    }

    //Second Configuration
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .authorizeHttpRequests(authorizeRequests -> {
                    authorizeRequests.requestMatchers("/api-jwt/index2").permitAll();
                    authorizeRequests.anyRequest().authenticated();
                })
                .formLogin().permitAll()
                .and()
                .build();
    }
}
