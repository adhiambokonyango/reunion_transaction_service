package com.silasonyango.transactionservice.controllers.children;

import com.silasonyango.transactionservice.repository.children.ChildrenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/children")
public class ChildrenController {
    ChildrenRepository childrenRepository;
}
