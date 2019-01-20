/**
MIT License

Copyright (c) 2019 wanbao118@outlook.com

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package edu.xust.ocr;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.tomcat.util.codec.binary.Base64;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.module.SimpleModule;

import edu.xust.ocr.sapi.model.InvoiceResponse;
import edu.xust.ocr.sapi.util.UnicodeDeserializer;

/**
 * @author jiangwanbao
 *
 */
public class ExOcrTest {

	private static final Logger log = LoggerFactory.getLogger(ExOcrTest.class);
	
	@Test
	public void test() throws Exception {

		String url = "http://test.exocr.com:8000/ocr/v1/invoice";

		CloseableHttpClient httpClient = HttpClientBuilder.create().useSystemProperties().build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);

		ObjectMapper mapper = new ObjectMapper();
		SimpleModule module = new SimpleModule();
		module.addDeserializer(String.class, new UnicodeDeserializer());
		mapper.registerModule(module);
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		mapper.setDefaultPrettyPrinter(new DefaultPrettyPrinter());
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
		messageConverter.setObjectMapper(mapper);

		restTemplate.getMessageConverters().add(messageConverter);

		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();

		File image = new File("C:\\Users\\jiangwanbao\\Pictures\\timg.jpg");
		String imageBase64 = Base64.encodeBase64String(FileUtils.readFileToByteArray(image));
		params.add("image_base64", imageBase64);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<LinkedMultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

		System.out.println(response.getBody());
	}
	
	@Test
	public void test2() throws Exception {

		String url = "http://test.exocr.com:8000/ocr/v1/invoice";

		CloseableHttpClient httpClient = HttpClientBuilder.create().useSystemProperties().build();
		HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory();
		requestFactory.setHttpClient(httpClient);
		RestTemplate restTemplate = new RestTemplate(requestFactory);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
		MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter();
		messageConverter.setObjectMapper(mapper);

		restTemplate.getMessageConverters().add(messageConverter);

		LinkedMultiValueMap<String, FileSystemResource> params = new LinkedMultiValueMap<String, FileSystemResource>();

		File image = new File("C:\\Users\\jiangwanbao\\Pictures\\timg.jpg");
		
		FileSystemResource resource = new FileSystemResource(image);
//		String imageBase64 = Base64.encodeBase64String(FileUtils.readFileToByteArray(image));
		params.add("image_binary", resource);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);

		HttpEntity<LinkedMultiValueMap<String, FileSystemResource>> requestEntity = new HttpEntity<>(params, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

//		System.out.println(response.getBody());
		ObjectMapper objectMapper = new ObjectMapper();
		SimpleModule module = new SimpleModule();
		module.addDeserializer(String.class, new UnicodeDeserializer());
		objectMapper.registerModule(module);
		InvoiceResponse object = mapper.readValue(response.getBody(), InvoiceResponse.class);
		log.debug("pretty json: {}", objectMapper.writeValueAsString(object));
	}
}
