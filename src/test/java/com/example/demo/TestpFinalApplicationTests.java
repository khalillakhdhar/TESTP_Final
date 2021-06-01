package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.validation.ValidProduit;

@SpringBootTest
class TestpFinalApplicationTests {

	@Test
	void contextLoads() {
	}
@Test
void verifachat()
{
ValidProduit vp=new ValidProduit();
assertTrue(vp.validPrix(23, 26));

}
}
