package com.example.interfacepractice.rest;

import com.example.interfacepractice.business.mapper.ResourceOneMapper;
import com.example.interfacepractice.business.service.ResourceOneService;
import com.example.interfacepractice.rest.dto.ResourceOneDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/open-api/res-one")
@RequiredArgsConstructor
public class ResourceOneController {

    private final ResourceOneService resourceOneService;

    @GetMapping("/do-smth")
    public ResourceOneDto doSmth(@RequestParam String param1) {
        return ResourceOneMapper.toDto(resourceOneService.doSmth(param1));
    }

}
