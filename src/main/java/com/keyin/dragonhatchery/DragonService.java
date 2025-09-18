package com.keyin.dragonhatchery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DragonService {

    @Autowired
    private DragonRepository dragonRepository;

    public Iterable<Dragon> getAllDragons() {
        return dragonRepository.findAll();
    }

    public Dragon createDragon(Dragon dragon) {
        return dragonRepository.save(dragon);
    }

    public Dragon createDragonWithRandomAttributes() {
        String[] names = {"Draco", "Smaug", "Falkor", "Toothless", "Saphira"};
        String[] colors = {"Red", "Blue", "Green", "Black", "White"};
        String[] elements = {"Fire", "Water", "Earth", "Air", "Lightning"};

        String name = names[(int) (Math.random() * names.length)];
        String color = colors[(int) (Math.random() * colors.length)];
        String element = elements[(int) (Math.random() * elements.length)];
        int age = (int) (Math.random() * 100);

        Dragon dragon = new Dragon(name, color, element, age);
        dragonRepository.save(dragon);
        return dragon;
    }

    public void updateDragon(Long id, Dragon updatedDragon) {
        Dragon existingDragon = dragonRepository.findById(id).orElseThrow(() -> new RuntimeException("Dragon not found"));
        existingDragon.setName(updatedDragon.getName());
        existingDragon.setColor(updatedDragon.getColor());
        existingDragon.setElement(updatedDragon.getElement());
        existingDragon.setAge(updatedDragon.getAge());
        dragonRepository.save(existingDragon);
    }


}
