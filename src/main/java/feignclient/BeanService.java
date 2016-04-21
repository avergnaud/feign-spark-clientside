package feignclient;

import feign.Param;
import feign.RequestLine;
import model.SomeBean;

public interface BeanService {
	@RequestLine("GET /getByName/{nameParam}")
    SomeBean getSomeBean(@Param("nameParam") String name);
}
