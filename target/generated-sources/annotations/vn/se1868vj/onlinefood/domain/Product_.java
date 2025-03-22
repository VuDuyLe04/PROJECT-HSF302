package vn.se1868vj.onlinefood.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Product.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Product_ {

	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#image
	 **/
	public static volatile SingularAttribute<Product, String> image;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#detailDesc
	 **/
	public static volatile SingularAttribute<Product, String> detailDesc;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#sold
	 **/
	public static volatile SingularAttribute<Product, Long> sold;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#price
	 **/
	public static volatile SingularAttribute<Product, Double> price;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#name
	 **/
	public static volatile SingularAttribute<Product, String> name;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#shortDesc
	 **/
	public static volatile SingularAttribute<Product, String> shortDesc;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#id
	 **/
	public static volatile SingularAttribute<Product, Long> id;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#storage
	 **/
	public static volatile SingularAttribute<Product, Boolean> storage;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product
	 **/
	public static volatile EntityType<Product> class_;
	
	/**
	 * @see vn.se1868vj.onlinefood.domain.Product#target
	 **/
	public static volatile SingularAttribute<Product, String> target;

	public static final String IMAGE = "image";
	public static final String DETAIL_DESC = "detailDesc";
	public static final String SOLD = "sold";
	public static final String PRICE = "price";
	public static final String NAME = "name";
	public static final String SHORT_DESC = "shortDesc";
	public static final String ID = "id";
	public static final String STORAGE = "storage";
	public static final String TARGET = "target";

}

