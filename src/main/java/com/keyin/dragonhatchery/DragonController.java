package com.keyin.dragonhatchery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dragon")
public class DragonController {

    @Autowired
    private DragonService dragonService;

    @GetMapping("/getAllDragons")
    public Iterable<Dragon> getAllDragons() {
        try {
            return dragonService.getAllDragons();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/createADragon")
    public ResponseEntity<Dragon> createADragon(@RequestBody Dragon createdDragon) {
        try {
            Dragon dragon = dragonService.createDragon(createdDragon);
            return ResponseEntity.ok(dragon);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/createRandomDragon")
    public ResponseEntity<Dragon> createRandomDragon() {
        try {
            Dragon dragon = dragonService.createDragonWithRandomAttributes();
            return ResponseEntity.ok(dragon);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/{id}/updateDragon")
    public void updateDragon(@PathVariable Long id, Dragon updatedDragon) {
        try {
            dragonService.updateDragon(id, updatedDragon);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
