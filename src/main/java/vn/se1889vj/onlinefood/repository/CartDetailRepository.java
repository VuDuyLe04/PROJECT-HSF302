package vn.se1889vj.onlinefood.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.se1889vj.onlinefood.domain.Cart;
import vn.se1889vj.onlinefood.domain.CartDetail;
import vn.se1889vj.onlinefood.domain.Product;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetail, Long> {
    boolean existsByCartAndProduct(Cart cart, Product product);

    CartDetail findByCartAndProduct(Cart cart, Product product);
}
