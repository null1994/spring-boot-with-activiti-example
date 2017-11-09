package org.springboot;

import org.activiti.engine.IdentityService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.entity.User;
import org.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkflowApplicationTests {
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private IdentityService identityService;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void contextLoads() {
		User user = new User();
		user.setName("zwh");
		userRepository.save(user);
	}

	@Test
	public void testFuck() {
		identityService.setAuthenticatedUserId("lisi");

		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("startUserId", "star");
		ProcessInstance fuck = runtimeService.startProcessInstanceByKey("myProcess_1", paramMap);
		System.out.println(fuck);
	}

}
