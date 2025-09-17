package org.yashgamerx.learn_restful_webservice.database;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.yashgamerx.learn_restful_webservice.dao.Employee;
import org.yashgamerx.learn_restful_webservice.repo.EmployeeRepository;

public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading {}", repository.save(new Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading {}", repository.save(new Employee("Frodo Baggins", "thief")));
        };
    }
}
