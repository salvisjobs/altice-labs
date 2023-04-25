package com.altice.labseq.config;

import com.altice.labseq.utils.Profiles;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Antonio Salviano Soares Júnior
 */
@Profile(Profiles.TEST)
@Configuration
public class TestConfig {
}
