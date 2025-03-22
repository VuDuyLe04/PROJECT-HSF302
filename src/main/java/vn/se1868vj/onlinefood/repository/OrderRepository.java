package vn.se1868vj.onlinefood.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.se1868vj.onlinefood.domain.Order;
import vn.se1868vj.onlinefood.domain.User;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);

    default Page<Order> findAllWithNewestFirst(Pageable pageable) {
        // Tạo Pageable với sắp xếp theo orderDate giảm dần
        Pageable sortedByNewestFirst = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), Sort.by(Sort.Order.desc("orderDate")));
        return findAll(sortedByNewestFirst);
    }
}
