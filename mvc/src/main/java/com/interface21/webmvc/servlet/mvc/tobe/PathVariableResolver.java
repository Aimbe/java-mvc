package com.interface21.webmvc.servlet.mvc.tobe;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

public class PathVariableResolver implements ArgumentResolver {

    public PathVariableResolver(String urlPattern) {
    }

    @Override
    public boolean supportsParameter(Parameter parameter) {
        return false;
    }

    @Override
    public Object resolve(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
