package com.sample.pcc.sampleapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableLogging;
import org.springframework.data.gemfire.config.annotation.EnablePdx;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@Configuration
@EnableGemfireRepositories
@EnableEntityDefinedRegions(basePackageClasses = Person.class)
@EnableLogging(logLevel = "config")
@EnablePdx
public class CloudCacheConfig {

}
