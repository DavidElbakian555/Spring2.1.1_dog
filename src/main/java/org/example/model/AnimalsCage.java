package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class AnimalsCage {

        //@Autowired
        private Animal animal;
        private Timer timer;

        public Timer getTimer() {
            return timer;
        }

        @Autowired
        public AnimalsCage(@Qualifier("wolf") Animal animal, Timer timer) {
            this.animal = animal;
            this.timer = timer;
        }

        public void whatAnimalSay() {
            System.out.println("Say:");
            System.out.println(animal.toString());
            System.out.println("At:");
            System.out.println(new Timer().getTime());
            System.out.println("________________________");
        }

}
