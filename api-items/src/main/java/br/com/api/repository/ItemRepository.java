package br.com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.api.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
