package vn.se1889vj.onlinefood.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

@StaticMetamodel(Order.class)
@Generated("org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
public abstract class Order_ {

	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#receiverAddress
	 **/
	public static volatile SingularAttribute<Order, String> receiverAddress;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#orderDetails
	 **/
	public static volatile ListAttribute<Order, OrderDetail> orderDetails;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#receiverPhone
	 **/
	public static volatile SingularAttribute<Order, String> receiverPhone;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#totalPrice
	 **/
	public static volatile SingularAttribute<Order, Double> totalPrice;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#receiverName
	 **/
	public static volatile SingularAttribute<Order, String> receiverName;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#id
	 **/
	public static volatile SingularAttribute<Order, Long> id;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order
	 **/
	public static volatile EntityType<Order> class_;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#orderDate
	 **/
	public static volatile SingularAttribute<Order, LocalDateTime> orderDate;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#user
	 **/
	public static volatile SingularAttribute<Order, User> user;
	
	/**
	 * @see vn.se1889vj.onlinefood.domain.Order#status
	 **/
	public static volatile SingularAttribute<Order, String> status;

	public static final String RECEIVER_ADDRESS = "receiverAddress";
	public static final String ORDER_DETAILS = "orderDetails";
	public static final String RECEIVER_PHONE = "receiverPhone";
	public static final String TOTAL_PRICE = "totalPrice";
	public static final String RECEIVER_NAME = "receiverName";
	public static final String ID = "id";
	public static final String ORDER_DATE = "orderDate";
	public static final String USER = "user";
	public static final String STATUS = "status";

}

