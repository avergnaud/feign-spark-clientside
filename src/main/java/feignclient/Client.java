package feignclient;

import model.SomeBean;
import feign.Feign;
import feign.gson.GsonDecoder;


public class Client {

	public static void main(String[] args) {

		BeanService service = Feign.builder()
        	.decoder(new GsonDecoder())
	        .target(BeanService.class, "http://localhost:4567");

		SomeBean myBean = service.getSomeBean("Serge");
		System.out.println(myBean.getName() + " " + myBean.getId());
	}

}
