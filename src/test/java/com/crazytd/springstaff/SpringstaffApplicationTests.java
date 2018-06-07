package com.crazytd.springstaff;

import com.alibaba.fastjson.JSON;
import com.heweather.sdk.api.HeConfig;
import com.heweather.sdk.api.HeWeather;
import com.heweather.sdk.bean.Lang;
import com.heweather.sdk.bean.Unit;
import com.heweather.sdk.bean.weather.now.Now;
import com.heweather.sdk.util.Callback;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.alibaba.druid.sql.ast.SQLPartitionValue.Operator.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringstaffApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void passwordEncoder(){
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String encode = bCryptPasswordEncoder.encode("123456");
		System.out.println(encode);
	}

	@Test
	public void heWeather(){
		HeConfig.init("HE1806071552091402","e384ed3dee5f422e88ae4c14d3fdbddf");
		HeConfig.switchToFreeServerNode();
		HeWeather.s6Now("CN101010300", Lang.CHINESE_SIMPLIFIED, Unit.METRIC, new Callback<java.util.List<Now>>() {
			@Override
			public void onSuccess(List<Now> nows) {
				System.out.println(JSON.toJSONString(nows));
			}

			@Override
			public void onError(Throwable throwable) {

			}
		});
	}
}
