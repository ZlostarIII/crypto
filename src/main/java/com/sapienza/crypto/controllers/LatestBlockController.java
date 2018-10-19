package com.sapienza.crypto.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapienza.crypto.models.LatestBlock;

@RestController
@RequestMapping("/api")
public class LatestBlockController {

	@GetMapping("/latestBlock")
	public ResponseEntity<?> getLatestBlock(HttpServletRequest httpServletRequest) {
		RestTemplate restTemplate = new RestTemplate();

		return ResponseEntity.ok(restTemplate.postForEntity("https://blockchain.info/latestblock", new LatestBlock(),
				LatestBlock.class));
	}
}
