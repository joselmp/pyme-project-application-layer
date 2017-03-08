package com.x.project.application.layer.domain.vo.parameter;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Interface to be implemented by API classes to simplify parameter extraction
 * in a generic way.
 * 
 * This interface is intended to be part of a
 * <a href="https://en.wikipedia.org/wiki/Composite_pattern">Composite</a>
 * desing pattern implementation, being this interface the <i>Component</i>.
 * 
 * @author Esteban Cristóbal
 */
public abstract class ApiMapper {

    /**
     * @return {@link Map} representation of fields contained on API
     */
    @SuppressWarnings("unchecked")
    public final Map<String, Object> getParameterMap() {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(this, Map.class);
    }

}