package org.jugru.jdbcExample.dao.executor;import lombok.AllArgsConstructor;import lombok.Getter;@Getter@AllArgsConstructorpublic class ParameterHolder {    private int index;    private Object value;    private int sqlType;}