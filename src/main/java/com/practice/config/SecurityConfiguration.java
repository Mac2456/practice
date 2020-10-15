//package com.practice.config;
//
//import ch.qos.logback.core.encoder.Encoder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
//    {
//        auth.inMemoryAuthentication().
//                withUser("admin").password(passwordEncoder().encode("admin123")).authorities("ADMIN")
//                .and()
//                .withUser("manager").password(passwordEncoder().encode("manager123")).authorities("MANAGER")
//                .and()
//                .withUser("user").password(passwordEncoder().encode("user123")).authorities("User");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception
//    {       http
//                    .authorizeRequests()
//                    .antMatchers("/student/getall").permitAll()
//                    .antMatchers("student/addname").authenticated()
//                    .antMatchers("student/updatename").hasAuthority("ADMIN")
//                    .antMatchers("student/removeName").hasAnyAuthority("User","MANAGER")
//                    .and().httpBasic().and().csrf().disable();
//
//
//
//        /*http.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated().and().httpBasic().and().sessionManagement().
//                sessionCreationPolicy(SessionCreationPolicy.NEVER).and().csrf().disable();*/
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
