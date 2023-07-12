package com.devsuperior.dslist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/gameList")
public class GameListController {

	@Autowired
	private GameListService gameListService;
}
