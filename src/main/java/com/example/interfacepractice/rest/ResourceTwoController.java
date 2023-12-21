package com.example.interfacepractice.rest;

import com.example.interfacepractice.business.mapper.ResourceTwoMapper;
import com.example.interfacepractice.business.service.ResourceTwoService;
import com.example.interfacepractice.rest.dto.ResourceTwoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("open-api/res-two")
@RequiredArgsConstructor
public class ResourceTwoController {

    ResourceTwoService resourceTwoService;

    @GetMapping("/do-smth")
    ResourceTwoDto doSmth(@RequestParam String param1) {
        return ResourceTwoMapper.toDto(resourceTwoService.doSmth(param1));
    }

}
