package com.annotation.profile;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({TestConfig.class,DevCinfig.class})
public class AppConfig {

}
