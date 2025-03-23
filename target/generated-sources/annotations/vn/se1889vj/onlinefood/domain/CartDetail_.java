package vn.se1889vj.onlinefood.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(CartDetail.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class CartDetail_ {

	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail#product
	 **/
	public static volatile SingularAttribute<CartDetail, Product> product;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail#quantity
	 **/
	public static volatile SingularAttribute<CartDetail, Long> quantity;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail#price
	 **/
	public static volatile SingularAttribute<CartDetail, Double> price;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail#id
	 **/
	public static volatile SingularAttribute<CartDetail, Long> id;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail
	 **/
	public static volatile EntityType<CartDetail> class_;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.CartDetail#cart
	 **/
	public static volatile SingularAttribute<CartDetail, Cart> cart;

	public static final String PRODUCT = "product";
	public static final String QUANTITY = "quantity";
	public static final String PRICE = "price";
	public static final String ID = "id";
	public static final String CART = "cart";

}

