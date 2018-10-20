//package com.spring.tktapp.config;
//
//import com.spring.tktapp.security.UserDetailsServiceImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    public SecurityConfiguration() {
//        super();
//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        // セキュリティ設定を無視するリクエスト設定
//        // 静的リソース(images、css、javascript)に対するアクセスはセキュリティ設定を無視する
//        web.ignoring().antMatchers(
//                "/images/**",
//                "/css/**",
//                "/js/**",
//                "/webjars/**");
//    }
//
//    @Override
//    protected void configure(final HttpSecurity http) throws Exception {
//        // 認可の設定
//        http.csrf().disable().authorizeRequests()
//                .mvcMatchers("/signin", "/signup", "/index").permitAll()
//                .anyRequest().authenticated()
//                .and()// 以下、ログイン設定
//                .formLogin()
//                .loginProcessingUrl("/perform_login")   // 認証処理のパス
//                .loginPage("/signin")            // ログインフォームのパス
////                .failureHandler(new SampleAuthenticationFailureHandler())       // 認証失敗時に呼ばれるハンドラクラス
//                .failureUrl("/index.html?error=true")
//                .defaultSuccessUrl("/home", true)     // 認証成功時の遷移先
//                .usernameParameter("email")  // ユーザー名のパラメータ名
//                .passwordParameter("password")  //パスワードのパラメータ名
//                .and() // 以下、ログアウト設定
//                .logout()
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout**"))       // ログアウト処理のパス
//                .logoutSuccessUrl("/");                                        // ログアウト完了時のパス
//    }
//
//    @Configuration
//    protected static class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {
//        final UserDetailsServiceImpl userDetailsService;
//
//        @Autowired
//        public AuthenticationConfiguration(UserDetailsServiceImpl userDetailsService) {
//            this.userDetailsService = userDetailsService;
//        }
//
//        @Override
//        public void init(AuthenticationManagerBuilder auth) throws Exception {
//            // 認証するユーザーを設定する
//            auth.userDetailsService(userDetailsService)
//                    // 入力値をbcryptでハッシュ化した値でパスワード認証を行う
//                    .passwordEncoder(new BCryptPasswordEncoder());
//
//        }
//    }
//}
