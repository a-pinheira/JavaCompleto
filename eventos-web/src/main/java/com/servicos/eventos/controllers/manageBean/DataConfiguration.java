package com.servicos.eventos.controllers.manageBean;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configurable
public class DataConfiguration {

	// o ManageBEAN serve para configurar os dados no BD e para especificar os
	// compornentes, regras de implementação e empacotamento (regra de negócio)

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/evento");
		dataSource.setUsername("root");
		dataSource.setPassword("123");
		return dataSource;
		// return (DataSource) dataSource;
	}

	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		// adapter.setDatabase(Database.MYSQL);
		adapter.setDatabase(Database.MYSQL);
		adapter.setShowSql(true);
		adapter.setGenerateDdl(true);
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}

}
