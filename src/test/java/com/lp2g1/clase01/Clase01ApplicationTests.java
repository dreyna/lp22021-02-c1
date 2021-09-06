package com.lp2g1.clase01;

import com.lp2g1.clase01.dao.IUsuario;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Clase01ApplicationTests {
@Autowired
private IUsuario iuser;
	@Test
	void contextLoads() {
            List<Map<String, Object>> users = iuser.readAll();

        assertThat(users);
	}

}
