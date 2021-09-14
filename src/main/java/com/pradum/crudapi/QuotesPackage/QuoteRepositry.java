package com.pradum.crudapi.QuotesPackage;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepositry extends JpaRepository<Quote,Long> {

}
