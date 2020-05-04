package com.silasonyango.transactionservice.controllers.children;

import com.silasonyango.transactionservice.repository.children.ChildrenCousinsRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/childrencousins")
public class ChildrenCousinsController {
    ChildrenCousinsRepository childrenCousinsRepository;
}
