package com.example.demo.conf;

import org.springframework.util.AntPathMatcher;

import java.util.Map;

/**
 * Created by think on 2017/8/19.
 */
public class CaseInsensitivePathMatcher extends AntPathMatcher {
    @Override
    protected boolean doMatch(String pattern, String path, boolean fullMatch, Map<String, String> uriTemplateVariables) {
        return super.doMatch(pattern.toLowerCase(), path.toLowerCase(), fullMatch, uriTemplateVariables);
    }
}