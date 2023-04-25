package com.altice.labseq;

import com.altice.labseq.utils.Profiles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(Profiles.TEST)
class LabseqApplicationTests {

	@Test
	void contextLoads() {
		Assertions.assertTrue(true);
	}

}
