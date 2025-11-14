package br.com.api.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import br.com.api.model.Item;
import br.com.api.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository repository;

    @GetMapping
    public List<Item> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Item> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping
    public Item adicionar(@RequestBody Item item) {
        return repository.save(item);
    }

    @PutMapping("/{id}")
    public Item atualizar(@PathVariable Long id, @RequestBody Item item) {
        item.setId(id);
        return repository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
