package com.microservices.products.controller;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/categories")
@Getter
@Setter
@RefreshScope
public class CategoryController {

    @Value(value = "${app.testProp}")
    private String appTestProp;

    @Value(value = "${boot.app.testProp}")
    private String bootTestProp;

    @Value(value = "${git.app.testProp}")
    private String gitTestProp;

    @GetMapping("/app-test-prop")
    public String getAppTestProp() {
        return this.appTestProp;
    }
    @GetMapping("/boot-test-prop")
    public String getBootTestProp() {
        return this.bootTestProp;
    }
    @GetMapping("/git-test-prop")
    public String getGitTestProp() { return this.gitTestProp; }

}
