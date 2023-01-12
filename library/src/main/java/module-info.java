module com.wafiloua.elmusa.library {
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.boot.starter;
    requires spring.boot.starter.data.elasticsearch;
    requires spring.boot.starter.data.jpa;
    requires org.postgresql.jdbc;
    requires java.sql;
    requires spring.session.core;
    requires liquibase.core;
    requires lombok;
}