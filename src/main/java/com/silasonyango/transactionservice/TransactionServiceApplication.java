package com.silasonyango.transactionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableJpaAuditing
public class TransactionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionServiceApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {

			final String clientUrl = "*";
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/user_roles/*").allowedOrigins(clientUrl);
				registry.addMapping("/roles/*").allowedOrigins(clientUrl);
				registry.addMapping("/access_privileges/*").allowedOrigins(clientUrl);
				registry.addMapping("/user_access_privileges/*").allowedOrigins(clientUrl);
				registry.addMapping("/users/*").allowedOrigins(clientUrl);
				registry.addMapping("/usersessionactivities/*").allowedOrigins(clientUrl);
				registry.addMapping("/sessionlogs/*").allowedOrigins(clientUrl);
				registry.addMapping("/sessionactivities/*").allowedOrigins(clientUrl);

				registry.addMapping("/actualdeductions/*").allowedOrigins(clientUrl);
				registry.addMapping("/actualquarter/*").allowedOrigins(clientUrl);
				registry.addMapping("/address/*").allowedOrigins(clientUrl);
				registry.addMapping("/cashflow/*").allowedOrigins(clientUrl);
				registry.addMapping("/cashflowtypes/*").allowedOrigins(clientUrl);
				registry.addMapping("/children/*").allowedOrigins(clientUrl);
				registry.addMapping("/childrencousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/contacts/*").allowedOrigins(clientUrl);
				registry.addMapping("/contributionreportupdate/*").allowedOrigins(clientUrl);
				registry.addMapping("/cousins/*").allowedOrigins(clientUrl);

				registry.addMapping("/deductiontype/*").allowedOrigins(clientUrl);

				registry.addMapping("/gender/*").allowedOrigins(clientUrl);

				registry.addMapping("/gggggrchildren/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggggrchildren/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggrchildren/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggrchildren/*").allowedOrigins(clientUrl);
				registry.addMapping("/grchildren/*").allowedOrigins(clientUrl);

				registry.addMapping("/grchildrencousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggrchildrencousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggrchildrencousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggggrchildrencousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggggrchildrencousins/*").allowedOrigins(clientUrl);

				registry.addMapping("/gggggrparents/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggggrparents/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggrparents/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggrparents/*").allowedOrigins(clientUrl);
				registry.addMapping("/grparents/*").allowedOrigins(clientUrl);

				registry.addMapping("/gggggrparentssiblings/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggggrparentssiblings/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggrparentssiblings/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggrparentssiblings/*").allowedOrigins(clientUrl);
				registry.addMapping("/grparentssiblings/*").allowedOrigins(clientUrl);

				registry.addMapping("/gggggrparentscousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggggrparentscousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/gggrparentscousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/ggrparentscousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/grparentscousins/*").allowedOrigins(clientUrl);

				registry.addMapping("/parents/*").allowedOrigins(clientUrl);
				registry.addMapping("/parentscousins/*").allowedOrigins(clientUrl);
				registry.addMapping("/parentsiblings/*").allowedOrigins(clientUrl);

				registry.addMapping("/months/*").allowedOrigins(clientUrl);
				registry.addMapping("/organizationaloverallamount/*").allowedOrigins(clientUrl);
				registry.addMapping("/siblings/*").allowedOrigins(clientUrl);
				registry.addMapping("/spouse/*").allowedOrigins(clientUrl);

				registry.addMapping("/users/*").allowedOrigins(clientUrl);
				registry.addMapping("/usercontributions/*").allowedOrigins(clientUrl);
			}
		};
	}

}
