package vn.se1889vj.onlinefood.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Cart.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Cart_ {

	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Cart#sum
	 **/
	public static volatile SingularAttribute<Cart, Integer> sum;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Cart#cartDetails
	 **/
	public static volatile ListAttribute<Cart, CartDetail> cartDetails;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Cart#id
	 **/
	public static volatile SingularAttribute<Cart, Long> id;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Cart
	 **/
	public static volatile EntityType<Cart> class_;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Cart#user
	 **/
	public static volatile SingularAttribute<Cart, User> user;

	public static final String SUM = "sum";
	public static final String CART_DETAILS = "cartDetails";
	public static final String ID = "id";
	public static final String USER = "user";

}

